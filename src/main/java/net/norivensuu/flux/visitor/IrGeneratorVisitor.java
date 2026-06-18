package net.norivensuu.flux.visitor;

import net.norivensuu.flux.antlr.FluxBaseVisitor;
import net.norivensuu.flux.compiler.FluxIr;
import net.norivensuu.flux.compiler.FluxIr.IrNode;
import net.norivensuu.flux.compiler.FluxIr.IrVisitor;
import net.norivensuu.flux.ir.EmptyIrNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import static net.norivensuu.flux.antlr.FluxParser.ProgramContext;

import static net.norivensuu.flux.antlr.FluxParser.*;
import static net.norivensuu.flux.utils.FluxUtils.*;

public class IrGeneratorVisitor extends FluxBaseVisitor<IrNode<String>> implements IrVisitor<String> {
    public FluxIr<String> ir;
    @Override
    public void setIr(FluxIr<?> ir) {
        this.ir = (FluxIr<String>) ir;
    }
    @Override
    public FluxIr<String> getIr() {
        return ir;
    }

    @Override
    public IrNode<String> visitProgram(ProgramContext ctx) {
        return getIr().of(ctx, (s) -> "program");
    }

    @Override
    public IrNode<String> visitClassDecl(ClassDeclContext ctx) {
        return getIr().of(ctx, (s) -> "class");
    }

    @Override
    public IrNode<String> visitPrecompile(PrecompileContext ctx) {
        return getIr().of(ctx, (s) -> "precompile");
    }

    @Override
    public IrNode<String> visitImportDecl(ImportDeclContext ctx) {
        return getIr().of(ctx, (s) -> "import");
    }

    @Override
    public IrNode<String> visitQualifiedId(QualifiedIdContext ctx) {
        return getIr().of(ctx, (s) -> String.format("(%s)", ctx.getText()));
    }

    @Override
    public IrNode<String> visitRunnableFunctionDecl(RunnableFunctionDeclContext ctx) {
        return getIr().of(ctx, (s) -> "runnable");
    }

    @Override
    public IrNode<String> visitFunctionModifiers(FunctionModifiersContext ctx) {
        return getIr().of(ctx, (s) -> String.format("modifiers (%s)", ctx.getText()));
    }
}
