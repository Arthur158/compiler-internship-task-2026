// Generated from MiniKotlin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniKotlinParser}.
 */
public interface MiniKotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniKotlinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniKotlinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MiniKotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MiniKotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MiniKotlinParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MiniKotlinParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MiniKotlinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MiniKotlinParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniKotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniKotlinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniKotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniKotlinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniKotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniKotlinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MiniKotlinParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MiniKotlinParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MiniKotlinParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MiniKotlinParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniKotlinParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniKotlinParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniKotlinParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniKotlinParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MiniKotlinParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MiniKotlinParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniKotlinParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniKotlinParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(MiniKotlinParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(MiniKotlinParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MiniKotlinParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MiniKotlinParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MiniKotlinParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MiniKotlinParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(MiniKotlinParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(MiniKotlinParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(MiniKotlinParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(MiniKotlinParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniKotlinParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniKotlinParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MiniKotlinParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MiniKotlinParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MiniKotlinParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MiniKotlinParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MiniKotlinParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MiniKotlinParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(MiniKotlinParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(MiniKotlinParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MiniKotlinParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MiniKotlinParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(MiniKotlinParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(MiniKotlinParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(MiniKotlinParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(MiniKotlinParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniKotlinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MiniKotlinParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniKotlinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MiniKotlinParser.ArgumentListContext ctx);
}