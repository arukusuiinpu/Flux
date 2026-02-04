package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode extends FluxNode<FluxParser.ExpressionContext> {
    public ExpressionNode(FluxParser.ExpressionContext context, FluxNode<?> parent) {
        super(context, parent);
    }

    public record ParenthesizedExpressionRecord(ExpressionNode expression) {}
    public ParenthesizedExpressionRecord parenthesizedExpressionRecord;

    public record ArrayExpressionRecord(List<ExpressionNode> expressions) {}
    public ArrayExpressionRecord arrayExpressionRecord;

    public record PostfixExpressionRecord(ExpressionNode expression, String operator) {}
    public PostfixExpressionRecord postfixExpressionRecord;

    public record CastExpressionRecord(TypeNode type, ExpressionNode expression) {}
    public CastExpressionRecord castExpressionRecord;

    @Override
    public Void visitParenthesizedExpr(FluxParser.ParenthesizedExprContext ctx) {
        var expression = new ExpressionNode(ctx.expression(), this);

        parenthesizedExpressionRecord = new ParenthesizedExpressionRecord(expression);
        return super.visitParenthesizedExpr(ctx);
    }

    @Override
    public Void visitArrayExpr(FluxParser.ArrayExprContext ctx) {
        var expressions = new ArrayList<ExpressionNode>();
        for (var expressionCtx : ctx.expressionList().expression()) {
            expressions.add(visit(new ExpressionNode(expressionCtx, this)));
        }
        arrayExpressionRecord = new ArrayExpressionRecord(expressions);
        return super.visitArrayExpr(ctx);
    }

    @Override
    public Void visitPostfixExpr(FluxParser.PostfixExprContext ctx) {
        var expression = visit(new ExpressionNode(ctx.expression(), this));

        postfixExpressionRecord = new PostfixExpressionRecord(expression, ctx.operator.getText());
        return super.visitPostfixExpr(ctx);
    }

    @Override
    public Record[] getRecords() {
        return new Record[] {
                parenthesizedExpressionRecord,
                arrayExpressionRecord,
                postfixExpressionRecord
        };
    }
}
