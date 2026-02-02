package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxIRVisitor;
import net.norivensuu.flux.structure.FluxNode;
import net.norivensuu.flux.structure.program.statement.StatementNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

import static net.norivensuu.flux.utils.FluxUtils.*;

public class ProgramNode extends FluxNode<FluxParser.ProgramContext> {

    public ProgramNode(FluxParser.ProgramContext ctx) {
        super(ctx, null);
    }

    @Override
    public Void visit(ParseTree ctx) {
        for (var statement : context.statement()) {
            visit(new StatementNode(statement, this));
        }

        return super.visit(context);
    }
}
