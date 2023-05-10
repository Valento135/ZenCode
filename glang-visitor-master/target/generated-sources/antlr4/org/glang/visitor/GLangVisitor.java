// Generated from org\glang\visitor\GLang.g4 by ANTLR 4.9.3
package org.glang.visitor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(GLangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GLangParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(GLangParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(GLangParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GLangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link GLangParser#systemFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(GLangParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(GLangParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(GLangParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GLangParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanBinaryOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBinaryOpExpression(GLangParser.BooleanBinaryOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericAddOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAddOpExpression(GLangParser.NumericAddOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(GLangParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(GLangParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(GLangParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanUnaryOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanUnaryOpExpression(GLangParser.BooleanUnaryOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringBinaryOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringBinaryOpExpression(GLangParser.StringBinaryOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericMultiOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericMultiOpExpression(GLangParser.NumericMultiOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#booleanUnaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanUnaryOp(GLangParser.BooleanUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#booleanBinaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBinaryOp(GLangParser.BooleanBinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#numericMultiOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericMultiOp(GLangParser.NumericMultiOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#numericAddOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericAddOp(GLangParser.NumericAddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#stringBinaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringBinaryOp(GLangParser.StringBinaryOpContext ctx);
}