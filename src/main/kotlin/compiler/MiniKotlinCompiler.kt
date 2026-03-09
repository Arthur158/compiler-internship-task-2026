package org.example.compiler

import MiniKotlinBaseVisitor
import MiniKotlinParser as P

/**
 * Compiles MiniKotlin AST to Java source code in CPS.
 */
class MiniKotlinCompiler : MiniKotlinBaseVisitor<String>() {

    /**
     * Counter for generating unique argument names (arg0, arg1, ...) for
     * continuation lambdas. Reset per function to keep names short.
     */
    private var argCounter = 0
    private fun freshArg() = "arg${argCounter++}"

    /**
     * Entry point. Compiles a full MiniKotlin program to a Java class.
     * Each MiniKotlin function becomes a public static method.
     */
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

    /**
     * Compiles a single function declaration to a Java static method.
     *
     * All functions except main get an extra Continuation<T> parameter appended.
     * The continuation receives the function's return value instead of a return statement.
     */
    fun compileFunction(function: P.FunctionDeclarationContext): String {
        argCounter = 0
        val name = function.IDENTIFIER().text
        val retType = compileType(function.type())

        val userParams = if (function.parameterList() != null)
            compileParams(function.parameterList().parameter()) + ", "
        else ""

        // main is special: it keeps the standard Java signature and has no continuation
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

    /**
     * Compiles a list of statements as a continuation chain.
     */
    fun compileBlock(stmts: List<P.StatementContext>, outerCont: String?): String {
        if (stmts.isEmpty()) return outerCont ?: ""
        return compileStmt(stmts[0], stmts.subList(1, stmts.size), outerCont)
    }

    /**
     * Compiles a single statement, threading the remaining statements ([rest]) and
     * [outerCont] as the continuation.
     * CPS is done by wrapping the follwing statements inside a continuation body
     */
    fun compileStmt(
        stmt: P.StatementContext,
        rest: List<P.StatementContext>,
        outerCont: String?
    ): String {
        // --- var x: T = expr ---
        // Evaluate expr in CPS, then declare the variable and continue with the rest.
        // If expr contains a function call, the declaration happens inside the callback.
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

        // --- x = expr ---
        // Evaluate expr in CPS, then emit the assignment and continue.
        if (stmt.variableAssignment() != null) {
            val assign = stmt.variableAssignment()
            val varName = assign.IDENTIFIER().text
            val expr = assign.expression()
            val restCode = compileBlock(rest, outerCont)

            return compileExprCPS(expr) { value ->
                "$varName = $value;\n$restCode"
            }
        }

        // Evaluate the condition in CPS, then emit both branches.
        // The rest of the block (restCode) is inlined into both branches since
        // Java has no way to "jump to" a shared continuation without a named method.
        if (stmt.ifStatement() != null) {
            val ifStmt = stmt.ifStatement()
            val condExpr = ifStmt.expression()
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

        // Note: This only works with simple while loops that do not contain function calls
        if (stmt.whileStatement() != null) {
            val wStmt = stmt.whileStatement()
            val condExpr = wStmt.expression()
            val restCode = compileBlock(rest, outerCont)

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

        // --- return expr ---
        // In CPS, return means "pass the value to the continuation" rather than
        // returning it on the call stack. We also emit a real return to stop execution.
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

        // Evaluate in CPS (which emits the call), then continue with the rest.
        // The result value is discarded.
        if (stmt.expression() != null) {
            val restCode = compileBlock(rest, outerCont)
            return compileExprCPS(stmt.expression()) { _ ->
                restCode
            }
        }

        return "unhandled"
    }

    /**
     * Compiles an expression in CPS by invoking [k] with the value string.
     */
    fun compileExprCPS(expr: P.ExpressionContext, k: (String) -> String): String {
        return when (expr) {
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

            // Function calls are the only non-pure expressions.
            // Arguments are evaluated left-to-right in CPS before the call is emitted.
            // The continuation lambda receives the return value as a fresh arg variable.
            is P.FunctionCallExprContext -> {
                val funcName = expr.IDENTIFIER().text
                val args = expr.argumentList()?.expression() ?: emptyList()

                compileArgListCPS(args) { argVals ->
                    val arg = freshArg()
                    val contBody = k(arg).prependIndent("    ")
                    // println is not a MiniKotlin builtin — map it to Prelude.println
                    val javaName = if (funcName == "println") "Prelude.println" else funcName
                    val argStr = if (argVals.isEmpty()) "" else argVals.joinToString(", ") + ", "
                    "$javaName(${argStr}($arg) -> {\n$contBody\n});"
                }
            }

            // Parenthesised expressions are transparent — just unwrap and continue.
            // Other primaries (literals, identifiers) are always pure.
            is P.PrimaryExprContext -> when (val p = expr.primary()) {
                is P.ParenExprContext -> compileExprCPS(p.expression(), k)
                else -> k(compilePrimary(p))
            }

            else -> error("Unknown expression type: $expr")
        }
    }

    /**
     * Compiles a binary expression where both operands are pure (no side effects
     * that require sequencing beyond left-to-right evaluation).
     */
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
     * Evaluates a list of argument expressions left-to-right in CPS,
     * collecting their value strings, then passes the full list to [k].
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

    /** Compiles a primary (leaf) expression to a plain Java expression string. */
    fun compilePrimary(primary: P.PrimaryContext): String = when (primary) {
        is P.IntLiteralContext     -> primary.INTEGER_LITERAL().text
        is P.StringLiteralContext  -> primary.STRING_LITERAL().text
        is P.BoolLiteralContext    -> primary.BOOLEAN_LITERAL().text
        is P.IdentifierExprContext -> primary.IDENTIFIER().text
        else -> error("Unknown primary: $primary")
    }

    /** Compiles a parameter list to a Java parameter string: "Integer a, String b" */
    fun compileParams(params: List<P.ParameterContext>): String {
        return params.joinToString(", ") { param ->
            compileType(param.type()) + " " + param.IDENTIFIER().text
        }
    }

    /** Maps MiniKotlin types to their boxed Java equivalents (needed for generics). */
    fun compileType(type: P.TypeContext): String {
        if (type.INT_TYPE() != null) return "Integer"
        if (type.STRING_TYPE() != null) return "String"
        if (type.UNIT_TYPE() != null) return "void"
        if (type.BOOLEAN_TYPE() != null) return "Boolean"
        return ""
    }
}
