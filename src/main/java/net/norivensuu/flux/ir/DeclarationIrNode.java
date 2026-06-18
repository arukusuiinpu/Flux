package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;

public class DeclarationIrNode extends FluxIr.IrNode<String, ParserRuleContext> {
    public DeclarationIrNode(FluxIr<String> ir, ParserRuleContext ctx) {
        super(ir, ctx);
    }

    public DeclarationIrNode(FluxIr<String> ir, FluxParser.VarDeclContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "declaration";
    }
}
