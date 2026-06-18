package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementIrNode extends FluxIr.IrNode<String, ParserRuleContext> {
    public StatementIrNode(FluxIr<String> ir, ParserRuleContext ctx) {
        super(ir, ctx);
    }

    public StatementIrNode(FluxIr<String> ir, FluxParser.ExpressionStatementContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "statement";
    }
}
