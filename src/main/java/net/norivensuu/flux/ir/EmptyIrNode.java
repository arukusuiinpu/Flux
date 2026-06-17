package net.norivensuu.flux.ir;

import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;

public class EmptyIrNode extends FluxIr.IrNode<java.lang.String> {
    public EmptyIrNode() {
        super(null, null);
    }

    @Override
    public String tokenize() {
        return "null";
    }
}
