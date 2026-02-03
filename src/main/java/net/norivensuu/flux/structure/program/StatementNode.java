package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class StatementNode extends FluxNode<FluxParser.StatementContext> {
    public StatementNode(FluxParser.StatementContext statement, FluxNode<?> parent) {
        super(statement, parent);
    }

    public record ImportRecord(boolean isStatic, String absoluteId, boolean wildcard) {}
    public ImportRecord importRecord;

    public record MethodRecord(String methodModifiers, String type, boolean wildcard) {}
    public MethodRecord methodRecord;

    public record VariableRecord(String variableModifiers, String type, String id, ExpressionNode expression) {}
    public VariableRecord variableRecord;


    @Override
    public Void visit(ParseTree tree) {
        var v = super.visit(tree);

        String info = "";
        var record = firstNonNull(importRecord);
        if (record != null) {
            info = String.format("%stype: %s", "\t".repeat(this.logLevel), record);
        }
        if (!info.isEmpty()) {
            Print(info);
        }

        return v;
    }

    @Override
    public Void visitImportDeclStatement(FluxParser.ImportDeclStatementContext ctx) {
        importRecord = new ImportRecord(
                ctx.importDecl().static_ != null,
                ctx.importDecl().absoluteId().getText(),
                ctx.importDecl().wildcard != null
        );
        return super.visitImportDeclStatement(ctx);
    }

    @Override
    public Void visitVarDeclStatement(FluxParser.VarDeclStatementContext ctx) {
        var expression = visit(new ExpressionNode(ctx.varDecl().localVarDecl().expression(), this));

        variableRecord = new VariableRecord(
                ctx.varDecl().variableModifiers().getText(),
                ctx.varDecl().localVarDecl().type() != null ?
                        ctx.varDecl().localVarDecl().type().getText() :
                        "var",
                ctx.varDecl().localVarDecl().ID().getText(),
                expression

        );
        return super.visit(ctx.varDecl().localVarDecl());
    }
}
