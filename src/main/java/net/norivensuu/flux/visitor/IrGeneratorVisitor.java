package net.norivensuu.flux.visitor;

import net.norivensuu.flux.antlr.FluxBaseVisitor;
import net.norivensuu.flux.compiler.FluxIr;
import net.norivensuu.flux.compiler.FluxIr.IrNode;
import net.norivensuu.flux.compiler.FluxIr.IrVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import static net.norivensuu.flux.antlr.FluxParser.ProgramContext;

import static net.norivensuu.flux.antlr.FluxParser.*;

import net.norivensuu.flux.ir.*;

public class IrGeneratorVisitor extends FluxBaseVisitor<IrNode<String, ? extends ParserRuleContext>> implements IrVisitor<String> {

    public FluxIr<String> ir;

    @Override
    @SuppressWarnings("unchecked")
    public void setIr(FluxIr<?> ir) {
        this.ir = (FluxIr<String>) ir;
    }

    @Override
    public FluxIr<String> getIr() {
        return ir;
    }

    //  PROGRAM

    @Override
    public IrNode<String, ProgramContext> visitProgram(ProgramContext ctx) {
        return of(ctx, "program");
    }

    @Override
    public IrNode<String, PrecompileContext> visitPrecompile(PrecompileContext ctx) {
        return of(ctx, "precompile");
    }

    @Override
    public IrNode<String, QualifiedIdContext> visitQualifiedId(QualifiedIdContext ctx) {
        return of(ctx, String.format("(%s)", ctx.getText()));
    }

    // FUNCTIONS

    @Override
    public IrNode<String, FunctionModifiersContext> visitFunctionModifiers(FunctionModifiersContext ctx) {
        return of(ctx, String.format("modifiers (%s)", ctx.getText()));
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitRunnableFunctionDecl(RunnableFunctionDeclContext ctx) {
        return of(ctx, FunctionIrNode.class);
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitVarFunctionDecl(VarFunctionDeclContext ctx) {
        return of(ctx, FunctionIrNode.class);
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitConsumerFunctionDecl(ConsumerFunctionDeclContext ctx) {
        return of(ctx, FunctionIrNode.class);
    }

    // DECLARATIONS

    @Override
    public IrNode<String, ClassDeclContext> visitClassDecl(ClassDeclContext ctx) {
        return of(ctx, ClassIrNode.class);
    }

    @Override
    public IrNode<String, ImportDeclContext> visitImportDecl(ImportDeclContext ctx) {
        return of(ctx, ImportIrNode.class);
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitVarDecl(VarDeclContext ctx) {
        return of(ctx, DeclarationIrNode.class);
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitExpressionStatement(ExpressionStatementContext ctx) {
        return of(ctx, StatementIrNode.class);
    }

    // BLOCKS

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitClassBlock(ClassBlockContext ctx) {
        return of(ctx, "block");
    }

    @Override
    public IrNode<String, ? extends ParserRuleContext> visitVoidBlock(VoidBlockContext ctx) {
        return of(ctx, "block");
    }
}
