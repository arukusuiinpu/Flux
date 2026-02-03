package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExpressionNode extends FluxNode<FluxParser.ExpressionContext> {
    public ExpressionNode(FluxParser.ExpressionContext context, FluxNode<?> parent) {
        super(context, parent);
    }

    @Override
    public Void visit(ParseTree tree) {
        var v = super.visit(tree);

        String info = "";
        var record = firstNonNull();
        if (record != null) {
            info = String.format("%stype: %s", "\t".repeat(this.logLevel), record);
        }
        if (!info.isEmpty()) {
            Print(info);
        }

        return v;
    }
}
