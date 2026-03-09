// Generated from MiniKotlin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniKotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniKotlinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniKotlinParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MiniKotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MiniKotlinParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MiniKotlinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniKotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniKotlinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniKotlinParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MiniKotlinParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MiniKotlinParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniKotlinParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniKotlinParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MiniKotlinParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniKotlinParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(MiniKotlinParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(MiniKotlinParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MiniKotlinParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(MiniKotlinParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(MiniKotlinParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MiniKotlinParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(MiniKotlinParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link MiniKotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniKotlinParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MiniKotlinParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(MiniKotlinParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MiniKotlinParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MiniKotlinParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link MiniKotlinParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(MiniKotlinParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniKotlinParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MiniKotlinParser.ArgumentListContext ctx);
}