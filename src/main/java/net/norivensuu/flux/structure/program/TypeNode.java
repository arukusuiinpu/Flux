package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;

public class TypeNode extends FluxNode<FluxParser.TypeContext> {
    public TypeNode(FluxParser.TypeContext context, FluxNode<?> parent) {
        super(context, parent);
    }

    public String type;

    @Override
    public Void visitType(FluxParser.TypeContext ctx) {
        String type0 = "";
        String type1 = "";
        if (ctx.type(0) != null) {
            type0 = visit(new TypeNode(ctx.type(0), this)).type;
            if (ctx.type(1) != null) {
                type1 = visit(new TypeNode(ctx.type(1), this)).type;
            }
        }
        type = String.format("%s<%s>", type0, type1);

        return super.visitType(ctx);
    }
}
