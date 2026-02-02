package net.norivensuu.flux.structure.program.statement;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxIRVisitor;
import net.norivensuu.flux.structure.FluxNode;
import net.norivensuu.flux.structure.program.ProgramNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class StatementNode extends FluxNode<FluxParser.StatementContext> {
    public StatementNode(FluxParser.StatementContext statement, FluxNode<?> parent) {
        super(statement, parent);
    }

    @Override
    public Void visitImportDeclStatement(FluxParser.ImportDeclStatementContext ctx) {
        return super.visitImportDeclStatement(ctx);
    }
}
