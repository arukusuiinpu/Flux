package net.norivensuu.flux.structure.program;

import net.norivensuu.flux.FluxParser;
import net.norivensuu.flux.structure.FluxNode;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode extends FluxNode<FluxParser.ExpressionContext> {
    public ExpressionNode(FluxParser.ExpressionContext context, FluxNode<?> parent) {
        super(context, parent);
    }

    public Record getExpression() { return firstNonNull(getRecords()); }

    public record ParenthesizedExpressionRecord(ExpressionNode expression) {}
    public ParenthesizedExpressionRecord parenthesizedExpressionRecord;

    public record ArrayExpressionRecord(List<ExpressionNode> expressions) {}
    public ArrayExpressionRecord arrayExpressionRecord;

    public record PostfixExpressionRecord(ExpressionNode expression, String operator) {}
    public PostfixExpressionRecord postfixExpressionRecord;

    public record CastExpressionRecord(TypeNode type, ExpressionNode expression) {}
    public CastExpressionRecord castExpressionRecord;

    public record ExpExpressionRecord(ExpressionNode left_expression, ExpressionNode right_expression) {}
    public ExpExpressionRecord expExpressionRecord;

    public record TetrExpressionRecord(ExpressionNode left_expression, ExpressionNode right_expression) {}
    public TetrExpressionRecord tetrExpressionRecord;

    public record UnaryExpressionRecord(String operator, ExpressionNode expression) {}
    public UnaryExpressionRecord unaryExpressionRecord;

    public record NotExpressionRecord(ExpressionNode expression) {}
    public NotExpressionRecord notExpressionRecord;

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
    public Void visitCastExpr(FluxParser.CastExprContext ctx) {
        var type = visit(new TypeNode(ctx.type(), this));
        var expression = visit(new ExpressionNode(ctx.expression(), this));

        castExpressionRecord = new CastExpressionRecord(type, expression);
        return super.visitCastExpr(ctx);
    }

    @Override
    public Void visitExpExpr(FluxParser.ExpExprContext ctx) {
        var left_expression = visit(new ExpressionNode(ctx.expression(0), this));
        var right_expression = visit(new ExpressionNode(ctx.expression(1), this));

        expExpressionRecord = new ExpExpressionRecord(left_expression, right_expression);
        return super.visitExpExpr(ctx);
    }

    @Override
    public Void visitTetrExpr(FluxParser.TetrExprContext ctx) {
        var left_expression = visit(new ExpressionNode(ctx.expression(0), this));
        var right_expression = visit(new ExpressionNode(ctx.expression(1), this));

        tetrExpressionRecord = new TetrExpressionRecord(left_expression, right_expression);
        return super.visitTetrExpr(ctx);
    }

    @Override
    public Void visitUnaryExpr(FluxParser.UnaryExprContext ctx) {
        var expression = visit(new ExpressionNode(ctx.expression(), this));

        unaryExpressionRecord = new UnaryExpressionRecord(ctx.operator.getText(), expression);
        return super.visitUnaryExpr(ctx);
    }

    @Override
    public Void visitNotExpr(FluxParser.NotExprContext ctx) {
        var expression = visit(new ExpressionNode(ctx.expression(), this));

        notExpressionRecord = new NotExpressionRecord(expression);
        return super.visitNotExpr(ctx);
    }
}
