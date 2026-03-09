package org.example.compiler

import MiniKotlinBaseVisitor
import MiniKotlinParser as P

class MiniKotlinCompiler : MiniKotlinBaseVisitor<String>() {

    private var argCounter = 0
    private fun freshArg() = "arg${argCounter++}"

    fun compile(program: P.ProgramContext, className: String = "MiniProgram"): String {
        var functions = ""
        for (func in program.functionDeclaration()) {
            functions += compileFunction(func) + "\n"
        }
        return """
            public class $className {
                $functions
            }
        """.trimIndent()
    }


    fun compileFunction(function: P.FunctionDeclarationContext): String {
        argCounter = 0
        val name = function.IDENTIFIER().text
        val retType = compileType(function.type())

        val userParams = if (function.parameterList() != null)
            compileParams(function.parameterList().parameter()) + ", "
        else ""

        val (sigParams, contParam) = if (name == "main")
            Pair("String[] args", "")
        else
            Pair("${userParams}Continuation<$retType> __continuation", "")

        val body = compileBlock(function.block().statement(), null)

        return """
            |public static void $name($sigParams$contParam) {
            |${body.prependIndent("    ")}
            |}
        """.trimMargin()
    }

    fun compileBlock(stmts: List<P.StatementContext>, outerCont: String?): String {
        if (stmts.isEmpty()) return outerCont ?: ""
        return compileStmt(stmts[0], stmts.subList(1, stmts.size), outerCont)
    }

    fun compileStmt(
        stmt: P.StatementContext,
        rest: List<P.StatementContext>,
        outerCont: String?
    ): String {
        // --- var declaration ---
        if (stmt.variableDeclaration() != null) {
            val decl = stmt.variableDeclaration()
            val varName = decl.IDENTIFIER().text
            val type = compileType(decl.type())
            val expr = decl.expression()
            val restCode = compileBlock(rest, outerCont)

            return compileExprCPS(expr) { value ->
                "$type $varName = $value;\n$restCode"
            }
        }

        // --- var assignment ---
        if (stmt.variableAssignment() != null) {
            val assign = stmt.variableAssignment()
            val varName = assign.IDENTIFIER().text
            val expr = assign.expression()
            val restCode = compileBlock(rest, outerCont)

            return compileExprCPS(expr) { value ->
                "$varName = $value;\n$restCode"
            }
        }

        if (stmt.ifStatement() != null) {
            val ifStmt = stmt.ifStatement()
            val condExpr = ifStmt.expression()

            // The "rest" of the block after this if is the shared continuation.
            // We materialise it as an inline lambda only if needed, or just inline it.
            // For simplicity we inline the rest into both branches (code duplication
            // is acceptable for a student CPS compiler; the alternative is a let-binding).
            val restCode = compileBlock(rest, outerCont)

            return compileExprCPS(condExpr) { condVal ->
                val thenCode = compileBlock(ifStmt.block(0).statement(), outerCont = restCode.ifEmpty { null })
                val elseCode = if (ifStmt.block().size > 1)
                    compileBlock(ifStmt.block(1).statement(), outerCont = restCode.ifEmpty { null })
                else restCode

                buildString {
                    append("if ($condVal) {\n")
                    append(thenCode.prependIndent("    "))
                    append("\n}")
                    if (elseCode.isNotBlank()) {
                        append(" else {\n")
                        append(elseCode.prependIndent("    "))
                        append("\n}")
                    }
                }
            }
        }

        if (stmt.whileStatement() != null) {
            val wStmt = stmt.whileStatement()
            val condExpr = wStmt.expression()
            val restCode = compileBlock(rest, outerCont)

            // While loops are kept as direct Java while loops (CPS of loops would
            // require trampolining which is beyond scope; the task example doesn't show it).
            return compileExprCPS(condExpr) { condVal ->
                val bodyCode = compileBlock(wStmt.block().statement(), outerCont = null)
                buildString {
                    append("while ($condVal) {\n")
                    append(bodyCode.prependIndent("    "))
                    append("\n}\n")
                    append(restCode)
                }
            }
        }


        if (stmt.returnStatement() != null) {
            val retStmt = stmt.returnStatement()
            return if (retStmt.expression() != null) {
                compileExprCPS(retStmt.expression()) { value ->
                    "__continuation.accept($value);\nreturn;"
                }
            } else {
                "__continuation.accept(null);\nreturn;"
            }
        }

        if (stmt.expression() != null) {
            val restCode = compileBlock(rest, outerCont)
            return compileExprCPS(stmt.expression()) { value ->
                restCode
            }
        }
        return "unhandled"
    }

    fun compileExprCPS(expr: P.ExpressionContext, k: (String) -> String): String {
        return when (expr) {
            // ---- binary/unary pure expressions --------------------------------
            is P.AndExprContext -> compileBinPureCPS(expr.expression(0), expr.expression(1), "&&", k)
            is P.OrExprContext  -> compileBinPureCPS(expr.expression(0), expr.expression(1), "||", k)
            is P.NotExprContext -> compileExprCPS(expr.expression()) { v -> k("!$v") }

            is P.MulDivExprContext -> {
                val op = when {
                    expr.MULT() != null -> "*"
                    expr.DIV()  != null -> "/"
                    expr.MOD()  != null -> "%"
                    else -> error("Unknown MulDiv op")
                }
                compileBinPureCPS(expr.expression(0), expr.expression(1), op, k)
            }

            is P.AddSubExprContext -> {
                val op = when {
                    expr.PLUS()  != null -> "+"
                    expr.MINUS() != null -> "-"
                    else -> error("Unknown AddSub op")
                }
                compileBinPureCPS(expr.expression(0), expr.expression(1), op, k)
            }

            is P.ComparisonExprContext -> {
                val op = when {
                    expr.LT() != null -> "<"
                    expr.GT() != null -> ">"
                    expr.LE() != null -> "<="
                    expr.GE() != null -> ">="
                    else -> error("Unknown Comparison op")
                }
                compileBinPureCPS(expr.expression(0), expr.expression(1), op, k)
            }

            is P.EqualityExprContext -> {
                val op = when {
                    expr.EQ()  != null -> "=="
                    expr.NEQ() != null -> "!="
                    else -> error("Unknown Equality op")
                }
                compileBinPureCPS(expr.expression(0), expr.expression(1), op, k)
            }

            // ---- function call  (the interesting CPS case) -------------------
            is P.FunctionCallExprContext -> {
                val funcName = expr.IDENTIFIER().text
                val args = expr.argumentList()?.expression() ?: emptyList()

                // Compile each argument left-to-right, collecting their values,
                // then emit the CPS call.
                compileArgListCPS(args) { argVals ->
                    val arg = freshArg()
                    val contBody = k(arg).prependIndent("    ")
                    // Special-case: map MiniKotlin println -> Prelude.println
                    val javaName = if (funcName == "println") "Prelude.println" else funcName
                    val argStr = if (argVals.isEmpty()) "" else argVals.joinToString(", ") + ", "
                    "$javaName(${argStr}($arg) -> {\n$contBody\n});"
                }
            }

            // ---- primary (always pure) ---------------------------------------
            is P.PrimaryExprContext -> when (val p = expr.primary()) {
                is P.ParenExprContext -> compileExprCPS(p.expression(), k)
                else -> k(compilePrimary(p))
            }

            else -> error("Unknown expression type: $expr")
        }
    }

    /** Compile a pure binary expression: evaluate lhs then rhs, combine. */
    private fun compileBinPureCPS(
        lhs: P.ExpressionContext,
        rhs: P.ExpressionContext,
        op: String,
        k: (String) -> String
    ): String = compileExprCPS(lhs) { lv ->
        compileExprCPS(rhs) { rv ->
            k("($lv $op $rv)")
        }
    }

    /**
     * Compile a list of argument expressions left-to-right, collecting values,
     * then call [k] with the full list of value strings.
     */
    private fun compileArgListCPS(
        args: List<P.ExpressionContext>,
        k: (List<String>) -> String
    ): String = compileArgListCPSAcc(args, 0, emptyList(), k)

    private fun compileArgListCPSAcc(
        args: List<P.ExpressionContext>,
        idx: Int,
        acc: List<String>,
        k: (List<String>) -> String
    ): String {
        if (idx == args.size) return k(acc)
        return compileExprCPS(args[idx]) { v ->
            compileArgListCPSAcc(args, idx + 1, acc + v, k)
        }
    }

    fun compilePrimary(primary: P.PrimaryContext): String = when (primary) {
        is P.IntLiteralContext     -> primary.INTEGER_LITERAL().text
        is P.StringLiteralContext  -> primary.STRING_LITERAL().text
        is P.BoolLiteralContext    -> primary.BOOLEAN_LITERAL().text
        is P.IdentifierExprContext -> primary.IDENTIFIER().text
        else -> error("Unknown primary: $primary")
    }


    fun compileParams(params: List<P.ParameterContext>): String {
        return params.joinToString(", ") { param ->
            compileType(param.type()) + " " + param.IDENTIFIER().text
        }
    }

    fun compileType(type: P.TypeContext): String {
        if (type.INT_TYPE() != null)return "Integer"
        if (type.STRING_TYPE() != null)return "String"
        if (type.UNIT_TYPE() != null)return "void"
        if (type.BOOLEAN_TYPE() != null)return "Boolean"
        return ""
    }
}
