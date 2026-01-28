package net.norivensuu.flux;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCodeGeneratorVisitor extends FluxBaseVisitor<String> {

    @Override
    public String visitProgram(FluxParser.ProgramContext ctx) {
        StringBuilder javaCode = new StringBuilder();

        for (FluxParser.DeclarationContext declarationCtx : ctx.declaration()) {
            if (declarationCtx.varDecl() != null) {
                FluxParser.VarDeclContext varDeclCtx = declarationCtx.varDecl();

                javaCode.append(visit(varDeclCtx)).append("\n");
            } else if (declarationCtx.functionDecl() != null) {
                String functionCode = visit(declarationCtx.functionDecl());
                javaCode.append(functionCode.replace("\n", "\n    ").trim()).append("\n");
            }
        }

        return javaCode.toString();
    }

    @Override
    public String visitIntExpr(FluxParser.IntExprContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitAddSubExpr(FluxParser.AddSubExprContext ctx) {
        return String.format("%s %s %s", visit(ctx.expression(0)), ctx.operator.getText(), visit(ctx.expression(1)));
    }

    @Override
    public String visitShiftExpr(FluxParser.ShiftExprContext ctx) {
        return String.format("%s %s %s", visit(ctx.expression(0)), ctx.operator.getText(), visit(ctx.expression(1)));
    }

    @Override
    public String visitTernaryExpr(FluxParser.TernaryExprContext ctx) {
        return String.format("((%s) ? %s : %s)", visit(ctx.expression(0)), visit(ctx.expression(1)), visit(ctx.expression(2)));
    }

    @Override
    public String visitMulDivExpr(FluxParser.MulDivExprContext ctx) {
        return String.format("%s %s %s", visit(ctx.expression(0)), ctx.operator.getText(), visit(ctx.expression(1)));
    }

    @Override
    public String visitEqualityExpr(FluxParser.EqualityExprContext ctx) {
        return String.format("%s %s %s", visit(ctx.expression(0)), ctx.operator.getText(), visit(ctx.expression(1)));
    }

    @Override
    public String visitRelationalExpr(FluxParser.RelationalExprContext ctx) {
        var parent = ctx.getParent();
        String text = String.format("%s %s %s", visit(ctx.expression(0)), ctx.operator.getText(), visit(ctx.expression(1)));
        if (parent != null) {
            if (parent instanceof FluxParser.RelationalExprContext) {
                return String.format("%s && %s", text, visit(ctx.expression(1)));
            }

        }
        return text;
    }

    @Override
    public String visitBitwiseANDExpr(FluxParser.BitwiseANDExprContext ctx) {
        return String.format("%s & %s", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitBitwiseXORExpr(FluxParser.BitwiseXORExprContext ctx) {
        return String.format("%s ^ %s", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitBitwiseORExpr(FluxParser.BitwiseORExprContext ctx) {
        return String.format("%s | %s", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitLogicalANDExpr(FluxParser.LogicalANDExprContext ctx) {
        return String.format("%s && %s", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitCastExpr(FluxParser.CastExprContext ctx) {
        return String.format("(%s)%s", ctx.type().getText(), visit(ctx.expression()));
    }

    @Override
    public String visitLogicalORExpr(FluxParser.LogicalORExprContext ctx) {
        return String.format("%s || %s", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitUnaryExpr(FluxParser.UnaryExprContext ctx) {
        return ctx.operator.getText() + visit(ctx.expression());
    }

    @Override
    public String visitDecimalExpr(FluxParser.DecimalExprContext ctx) {
        var varDecl = getToClosestParent(ctx, FluxParser.VarDeclContext.class);
        if (varDecl != null) {
            String type = varDecl.type().getText();
            String text = ctx.DECIMAL().getText();

            if (type.equals("float"))
                return text.endsWith("f") || text.endsWith("F") ? text : text + "f";
        }
        var assignmentStat = getToClosestParent(ctx, FluxParser.AssignmentStatContext.class);
        var siblings = getToSiblingsOfType(ctx, FluxParser.DeclarationContext.class);
        if (assignmentStat != null && !siblings.isEmpty()) {
            for (var sibling : siblings) {
                if (sibling.varDecl() != null) {
                    var globalVarDecl = sibling.varDecl();

                    String type = globalVarDecl.type().getText();
                    String text = ctx.DECIMAL().getText();

                    if (type.equals("float"))
                        return text.endsWith("f") || text.endsWith("F") ? text : text + "f";
                }
            }
        }
        return ctx.DECIMAL().getText();
    }

    @Override
    public String visitPostfixExpr(FluxParser.PostfixExprContext ctx) {
        return String.format("%s%s", visit(ctx.expression()), ctx.operator.getText());
    }

    @Override
    public String visitIdExpr(FluxParser.IdExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpExpr(FluxParser.ExpExprContext ctx) {
        return String.format("Math.pow(%s, %s)", visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public String visitParenthesizedExpr(FluxParser.ParenthesizedExprContext ctx) {
        return String.format("(%s)", visit(ctx.expression()));
    }

    @Override
    public String visitNotExpr(FluxParser.NotExprContext ctx) {
        return '!' + visit(ctx.expression());
    }

    @Override
    public String visitBoolExpr(FluxParser.BoolExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBlock(FluxParser.BlockContext ctx) {
        StringBuilder blockCode = new StringBuilder("{\n");
        for (FluxParser.StatementContext statementCtx : ctx.statement()) {
            blockCode.append(visit(statementCtx)).append("\r");
        }
        blockCode.append("}");
        return blockCode.toString();
    }

    @Override
    public String visitBlockStatement(FluxParser.BlockStatementContext ctx) {
        // TODO Implement
        return super.visitBlockStatement(ctx);
    }

    @Override
    public String visitVarDeclStatement(FluxParser.VarDeclStatementContext ctx) {
        return visitVarDecl(ctx.varDecl());
    }

    @Override
    public String visitIfStatement(FluxParser.IfStatementContext ctx) {
        String string = "if (";
        string += visit(ctx.expression()) + ")";
        string += visit(ctx.block(0)) + "\n";
        return string;
    }

    @Override
    public String visitFunctionDecl(FluxParser.FunctionDeclContext ctx) {
        String returnType = ctx.type().getText();
        String functionName = ctx.ID().getText();

        String parameters = "";
        if (ctx.formalParameters() != null) {
            parameters = ctx.formalParameters().formalParameter().stream()
                    .map(this::visitFormalParameter)
                    .collect(Collectors.joining(", "));
        }

        String body = visitBlock(ctx.block());

        String functionModifiers = parseFunctionModifiers(ctx.functionModifiers());

        return String.format("%s%s %s(%s) %s\n", functionModifiers, returnType, functionName, parameters, body);
    }

    public String parseFunctionModifiers(FluxParser.FunctionModifiersContext ctx) {
        StringBuilder builder = new StringBuilder();

        if (ctx.accessModifier() != null) {
            builder.append(ctx.accessModifier().getText()).append(" ");
        }
        if (ctx.implementationModifier() != null) {
            builder.append(ctx.implementationModifier().getText()).append(" ");
        }
        if (ctx.finalMd() != null) {
            builder.append(ctx.finalMd().getText()).append(" ");
        }
        if (ctx.transientMd() != null) {
            builder.append(ctx.transientMd().getText()).append(" ");
        }
        if (ctx.volatileMd() != null) {
            builder.append(ctx.volatileMd().getText()).append(" ");
        }
        if (ctx.synchronizedMd() != null) {
            builder.append(ctx.synchronizedMd().getText()).append(" ");
        }
        if (ctx.nativeMd() != null) {
            builder.append(ctx.nativeMd().getText()).append(" ");
        }
        if (ctx.strictfpMd() != null) {
            builder.append(ctx.strictfpMd().getText()).append(" ");
        }
        return builder.toString();
    }

    @Override
    public String visitFunctionCallExpr(FluxParser.FunctionCallExprContext ctx) {
        String functionName = ctx.ID().getText();
        String args = "";
        if (ctx.expressionList() != null) {
            args = ctx.expressionList().expression().stream()
                    .map(this::visit)
                    .collect(Collectors.joining(", "));
        }
        return functionName + "(" + args + ")";
    }

    public String visitFormalParameter(FluxParser.FormalParameterContext ctx) {
        return ctx.type().getText() + " " + ctx.ID().getText();
    }

    @Override
    public String visitReturnStatement(FluxParser.ReturnStatementContext ctx) {
        if (ctx.expression() != null) {
            return "return " + visit(ctx.expression()) + ";";
        } else {
            return "return;";
        }
    }

    @Override
    public String visitAssignmentStatement(FluxParser.AssignmentStatementContext ctx) {
        if (ctx.assignmentStat().expression(1) != null) {
            return String.format("%s[%s] = %s;", ctx.assignmentStat().ID().getText(), visit(ctx.assignmentStat().expression(1)), visit(ctx.assignmentStat().expression(0)));
        }
        else return String.format("%s = %s;", ctx.assignmentStat().ID().getText(), visit(ctx.assignmentStat().expression(0)));
    }

    @Override
    public String visitExpressionStatement(FluxParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression()) + ";";
    }

    @Override
    public String visitVarDecl(FluxParser.VarDeclContext ctx) {
        String type = convertType(ctx.type().getText());
        String id = ctx.ID().getText();

        String variableModifiers = parseVariableModifiers(ctx.variableModifiers());

        if (ctx.expression() != null) {
            String expressionValue = visit(ctx.expression());
            return String.format("%s%s %s = %s;", variableModifiers, type, id, expressionValue);

        }  else {
            return String.format("%s%s %s;", variableModifiers, type, id);
        }
    }

    public static <T extends ParseTree> T getToClosestParent(ParseTree ctx, Class<T> targetType) {
        ParseTree parent = ctx.getParent();

        if (parent != null) {
            if (targetType.isInstance(parent)) {
                return targetType.cast(parent);
            } else {
                return getToClosestParent(parent, targetType);
            }
        }

        return null;
    }

    public static <T extends ParseTree> T getToClosestSibling(ParseTree ctx, Class<T> targetType) {
        ParseTree parent = ctx.getParent();

        if (parent != null) {
            for (int i = 0; i < parent.getChildCount(); i++) {
                var sibling = parent.getChild(i);
                if (targetType.isInstance(sibling)) {
                    return targetType.cast(sibling);
                }
            }
            return getToClosestSibling(parent, targetType);
        }

        return null;
    }

    public static <T extends ParseTree> List<T> getToSiblingsOfType(ParseTree ctx, Class<T> targetType) {
        ParseTree parent = ctx.getParent();
        List<T> siblings = new ArrayList<>();

        if (parent != null) {
            boolean found = false;
            for (int i = 0; i < parent.getChildCount(); i++) {
                var sibling = parent.getChild(i);
                if (targetType.isInstance(sibling)) {
                    found = true;
                    siblings.add(targetType.cast(sibling));
                }
            }
            if (!found) {
                for (var sibling : getToSiblingsOfType(parent, targetType)) {
                    siblings.add(targetType.cast(sibling));
                }
            }
        }

        return siblings;
    }

    public String parseVariableModifiers(FluxParser.VariableModifiersContext ctx) {
        StringBuilder builder = new StringBuilder();

        if (ctx.accessModifier() != null) {
            builder.append(ctx.accessModifier().getText()).append(" ");
        }
        if (ctx.staticMd() != null) {
            builder.append(ctx.staticMd().getText()).append(" ");
        }
        if (ctx.finalMd() != null) {
            builder.append(ctx.finalMd().getText()).append(" ");
        }
        if (ctx.transientMd() != null) {
            builder.append(ctx.transientMd().getText()).append(" ");
        }
        if (ctx.volatileMd() != null) {
            builder.append(ctx.volatileMd().getText()).append(" ");
        }
        return builder.toString();
    }

    public String convertType(String type) {
        if (type.equals("bool"))
            return "boolean";
        return type;
    }

    public <T> void Print(T out) {
        System.out.println(out);
    }
}