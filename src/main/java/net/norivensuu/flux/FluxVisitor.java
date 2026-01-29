// Generated from C:/Users/AlexN/Projects/IdeaProjects/Flux/src/main/antlr/Flux.g4 by ANTLR 4.13.2
package net.norivensuu.flux;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FluxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FluxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FluxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FluxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(FluxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FluxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(FluxParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(FluxParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#implementationModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementationModifier(FluxParser.ImplementationModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#staticMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMd(FluxParser.StaticMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#finalMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalMd(FluxParser.FinalMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#transientMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransientMd(FluxParser.TransientMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#volatileMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVolatileMd(FluxParser.VolatileMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#synchronizedMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedMd(FluxParser.SynchronizedMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#nativeMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeMd(FluxParser.NativeMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#strictfpMd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictfpMd(FluxParser.StrictfpMdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(FluxParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(FluxParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#functionModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifiers(FluxParser.FunctionModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(FluxParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(FluxParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(FluxParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FluxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(FluxParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStatement(FluxParser.VarDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FluxParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FluxParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclStatement(FluxParser.FunctionDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(FluxParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(FluxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#assignmentStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStat(FluxParser.AssignmentStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(FluxParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(FluxParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(FluxParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseANDExpr(FluxParser.BitwiseANDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(FluxParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpExpr(FluxParser.ExpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalORExpr(FluxParser.LogicalORExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(FluxParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(FluxParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(FluxParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseXORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXORExpr(FluxParser.BitwiseXORExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(FluxParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqParenthesizedExpr(FluxParser.SqParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(FluxParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(FluxParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseORExpr(FluxParser.BitwiseORExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(FluxParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(FluxParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(FluxParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpr(FluxParser.DecimalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(FluxParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(FluxParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalANDExpr(FluxParser.LogicalANDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(FluxParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(FluxParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(FluxParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FluxParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FluxParser.ExpressionListContext ctx);
}