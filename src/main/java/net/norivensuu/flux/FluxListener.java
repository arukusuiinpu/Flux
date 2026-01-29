// Generated from C:/Users/AlexN/Projects/IdeaProjects/Flux/src/main/antlr/Flux.g4 by ANTLR 4.13.2
package net.norivensuu.flux;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FluxParser}.
 */
public interface FluxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FluxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FluxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FluxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FluxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FluxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FluxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FluxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(FluxParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(FluxParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(FluxParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(FluxParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#implementationModifier}.
	 * @param ctx the parse tree
	 */
	void enterImplementationModifier(FluxParser.ImplementationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#implementationModifier}.
	 * @param ctx the parse tree
	 */
	void exitImplementationModifier(FluxParser.ImplementationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#staticMd}.
	 * @param ctx the parse tree
	 */
	void enterStaticMd(FluxParser.StaticMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#staticMd}.
	 * @param ctx the parse tree
	 */
	void exitStaticMd(FluxParser.StaticMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#finalMd}.
	 * @param ctx the parse tree
	 */
	void enterFinalMd(FluxParser.FinalMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#finalMd}.
	 * @param ctx the parse tree
	 */
	void exitFinalMd(FluxParser.FinalMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#transientMd}.
	 * @param ctx the parse tree
	 */
	void enterTransientMd(FluxParser.TransientMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#transientMd}.
	 * @param ctx the parse tree
	 */
	void exitTransientMd(FluxParser.TransientMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#volatileMd}.
	 * @param ctx the parse tree
	 */
	void enterVolatileMd(FluxParser.VolatileMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#volatileMd}.
	 * @param ctx the parse tree
	 */
	void exitVolatileMd(FluxParser.VolatileMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#synchronizedMd}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedMd(FluxParser.SynchronizedMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#synchronizedMd}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedMd(FluxParser.SynchronizedMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#nativeMd}.
	 * @param ctx the parse tree
	 */
	void enterNativeMd(FluxParser.NativeMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#nativeMd}.
	 * @param ctx the parse tree
	 */
	void exitNativeMd(FluxParser.NativeMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#strictfpMd}.
	 * @param ctx the parse tree
	 */
	void enterStrictfpMd(FluxParser.StrictfpMdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#strictfpMd}.
	 * @param ctx the parse tree
	 */
	void exitStrictfpMd(FluxParser.StrictfpMdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(FluxParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(FluxParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(FluxParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(FluxParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#functionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifiers(FluxParser.FunctionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#functionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifiers(FluxParser.FunctionModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(FluxParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(FluxParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(FluxParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(FluxParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FluxParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FluxParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FluxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FluxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(FluxParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(FluxParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStatement(FluxParser.VarDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStatement(FluxParser.VarDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FluxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FluxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FluxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FluxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclStatement(FluxParser.FunctionDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclStatement(FluxParser.FunctionDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(FluxParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(FluxParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(FluxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link FluxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(FluxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#assignmentStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStat(FluxParser.AssignmentStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#assignmentStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStat(FluxParser.AssignmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FluxParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FluxParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(FluxParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(FluxParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(FluxParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(FluxParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseANDExpr(FluxParser.BitwiseANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseANDExpr(FluxParser.BitwiseANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(FluxParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(FluxParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpExpr(FluxParser.ExpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpExpr(FluxParser.ExpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalORExpr(FluxParser.LogicalORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalORExpr(FluxParser.LogicalORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(FluxParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(FluxParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(FluxParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(FluxParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(FluxParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(FluxParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseXORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXORExpr(FluxParser.BitwiseXORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseXORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXORExpr(FluxParser.BitwiseXORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(FluxParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(FluxParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSqParenthesizedExpr(FluxParser.SqParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSqParenthesizedExpr(FluxParser.SqParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(FluxParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(FluxParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(FluxParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(FluxParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseORExpr(FluxParser.BitwiseORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseORExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseORExpr(FluxParser.BitwiseORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(FluxParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(FluxParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(FluxParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(FluxParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(FluxParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(FluxParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpr(FluxParser.DecimalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpr(FluxParser.DecimalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(FluxParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(FluxParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(FluxParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(FluxParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalANDExpr(FluxParser.LogicalANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalANDExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalANDExpr(FluxParser.LogicalANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(FluxParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(FluxParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(FluxParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(FluxParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(FluxParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link FluxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(FluxParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FluxParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FluxParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FluxParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FluxParser.ExpressionListContext ctx);
}