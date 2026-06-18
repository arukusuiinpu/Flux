package net.norivensuu.flux.ir;

import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;

public class EmptyIrNode extends FluxIr.IrNode<java.lang.String, ParserRuleContext> {

    public EmptyIrNode(FluxIr<String> ir, ParserRuleContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "null";
    }
}
