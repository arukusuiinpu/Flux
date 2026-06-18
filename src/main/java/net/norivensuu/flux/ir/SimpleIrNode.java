package net.norivensuu.flux.ir;

import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.compiler.FluxIr;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SimpleIrNode<T, K extends ParserRuleContext> extends FluxIr.IrNode<T, K> {
    Function<FluxIr.IrNode<T, K>, T> tokenizer;

    public SimpleIrNode(FluxIr<T> ir, K ctx, Function<FluxIr.IrNode<T, K>, T> tokenizer) {
        super(ir, ctx);

        this.tokenizer = tokenizer;
    }

    @Override
    public T getBaseToken() {
        return tokenizer.apply(this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T tokenize() {
        T token = super.tokenize();

        visitChildren();

        return token;
    }
}
