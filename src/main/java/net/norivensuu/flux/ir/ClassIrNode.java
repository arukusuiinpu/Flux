package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;

public class ClassIrNode extends FluxIr.IrNode<String, FluxParser.ClassDeclContext> {
    public ClassIrNode(FluxIr<String> ir, FluxParser.ClassDeclContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "class";
    }
}
