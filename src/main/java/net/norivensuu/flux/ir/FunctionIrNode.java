package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;

public class FunctionIrNode extends FluxIr.IrNode<String, ParserRuleContext> {

    public FunctionIrNode(FluxIr<String> ir, FluxParser.RunnableFunctionDeclContext ctx) {
        super(ir, ctx);
    }

    public FunctionIrNode(FluxIr<String> ir, FluxParser.VarFunctionDeclContext ctx) {
        super(ir, ctx);
    }

    public FunctionIrNode(FluxIr<String> ir, FluxParser.ConsumerFunctionDeclContext ctx) {
        super(ir, ctx);
    }

    @Override
    public String getBaseToken() {
        return "function";
    }

    @Override
    public String tokenize() {
        return super.tokenize();
    }
}

