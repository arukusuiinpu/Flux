package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxCompiler;
import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ProgramNode extends FluxNode<FluxParser.ProgramContext> {

    public ProgramNode(FluxCompiler.Program program, FluxParser.ProgramContext ctx) {
        super(ctx, null);
        this.program = program;

        program.IR.addNode(this);
    }

    @Override
    public Void visit(ParseTree ctx) {
        var v = super.visit(context);

        for (var statement : context.statement()) {
            visit(new StatementNode(statement, this));
        }

        Print(program.IR.tree);
        Print(program.IR.typeMap);

        return v;
    }
}
