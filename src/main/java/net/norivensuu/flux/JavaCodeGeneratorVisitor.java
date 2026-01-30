package net.norivensuu.flux;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static net.norivensuu.flux.FluxParser.*;

public class JavaCodeGeneratorVisitor extends FluxBaseVisitor<String> {

    public final List<String> pendingAssertions = new ArrayList<>();

    public static class JavaCode {
        public StringBuilder builder;
        public int indentLevel;

        public JavaCode() {
            builder = new StringBuilder();
        }

        public JavaCode append(String line) {
            builder.append(line);
            return this;
        }

        public JavaCode addLine(String line) {
            return append("\t".repeat(indentLevel))
                    .append(line)
                    .append("\n");
        }

        @Override
        public String toString() {
            return builder.toString();
        }
    }

    JavaCode javaCode;

    @Override
    public String visitProgram(FluxParser.ProgramContext ctx) {
        javaCode = new JavaCode();

        for (FluxParser.DeclarationContext declarationCtx : ctx.declaration()) {
            if (declarationCtx.importDecl() != null) {
                FluxParser.ImportDeclContext importDeclCtx = declarationCtx.importDecl();

                javaCode.addLine(visit(importDeclCtx));
            } else if (declarationCtx.varDecl() != null) {
                FluxParser.VarDeclContext varDeclCtx = declarationCtx.varDecl();

                javaCode.addLine(visit(varDeclCtx));
            } else if (declarationCtx.functionDecl() != null) {
                String functionCode = visit(declarationCtx.functionDecl());
                javaCode.addLine(functionCode.replace("\n", "\n    ").trim());
            }
        }

        return javaCode.toString();
    }

    @Override
    public String visitImportDecl(ImportDeclContext ctx) {
        return String.format("import %s%s;", ctx.qualifiedId().getText(), ctx.wildcard != null ? ctx.wildcard.getText() : "");
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
        String leftExpr = visit(ctx.expression(0));
        String rightExpression = visit(ctx.expression(1));
        String operator = ctx.operator.getText();

        if (parent instanceof FluxParser.RelationalExprContext) {
            if (ctx.expression(1) instanceof FluxParser.FunctionCallExprContext idExpr) {
                var declaration = getDeclaration(idExpr.qualifiedId().getText(), ctx);

                if (declaration != null) {
                    String varName = "_" + declaration.id + "$" + ctx.hashCode();
                    String typePrefix = (getDeclaration(varName, ctx) == null) ? declaration.type + " " : "";

                    pendingAssertions.add(String.format("%s%s = %s;", typePrefix, varName, rightExpression));

                    return String.format("%s %s %s && %s", leftExpr, operator, varName, varName);
                }
            }
            return String.format("%s %s %s && %s", leftExpr, operator, rightExpression, rightExpression);
        }

        return String.format("%s %s %s", leftExpr, operator, rightExpression);
    }

    @SafeVarargs
    public final <T> T firstNonNull(T... objects) {
        return Stream.of(objects)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
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
        return String.format("(%s)%s", convertType(ctx.type().getText()), visit(ctx.expression()));
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
        String type = null;
        String text = ctx.DECIMAL().getText();

        var varDecl = getToClosestParent(ctx, FluxParser.VarDeclContext.class);
        if (varDecl != null) {
            type = convertType(varDecl.type().getText());
        }
        var assignmentStat = getToClosestParent(ctx, FluxParser.AssignmentStatContext.class);
        if (assignmentStat != null) {
            var declaration = getDeclaration(assignmentStat.qualifiedId().getText(), ctx);
            if (declaration != null) {
                type = convertType(declaration.type);
            }
        }
        var functionCallStat = getToClosestParent(ctx, FluxParser.FunctionCallExprContext.class);
        if (functionCallStat != null) {
            var functionDeclStat = firstNonNull(
                    Objects.requireNonNull(getToClosestSibling(ctx, FunctionDeclStatementContext.class)).functionDecl(),
                    getToClosestSibling(ctx, FluxParser.FunctionDeclContext.class)
            );
            var formalParameters = functionDeclStat instanceof FluxParser.RunnableFunctionDeclContext ? ((RunnableFunctionDeclContext) functionDeclStat).formalParameters() : ((ConsumerFunctionDeclContext) functionDeclStat).formalParameters();
            if (formalParameters != null) {
                int i = 0;
                int j = whatParameterAmI(ctx, functionCallStat.expressionList());

                for (var parameter : formalParameters.formalParameter()) {
                    if (i == j) {
                        var declaration = getDeclaration(parameter.ID().getText(), ctx);
                        if (declaration != null) {
                            type = convertType(declaration.type);
                        }
                    }
                    i += 1;
                }
            }
        }

        if (type != null) {
            if (type.equals("float"))
                return text.endsWith("f") || text.endsWith("F") ? text : text + "f";
        }
        return ctx.DECIMAL().getText();
    }

    public int whatParameterAmI(ParseTree ctx,  FluxParser.ExpressionListContext parent) {
        for (int i = 0; i < parent.expression().size(); i++) {
            if (parent.expression(i).equals(ctx)) return i;
        }
        return -1;
    }

    public int whatChildAmI(ParseTree ctx) {
        return whatChildAmI(ctx, ctx.getParent());
    }

    public int whatChildAmI(ParseTree ctx, ParseTree parent) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            if (parent.getChild(i).equals(ctx)) return i;
        }
        return -1;
    }

    public static class Declaration {
        public String type;
        public String id;
        public ParseTree declaration;

        public String declarationType = "var";

        public Declaration(String type, String id, ParseTree declaration) {
            this.type = type;
            this.id = id;
            this.declaration = declaration;
        }

        public Declaration(String type, String id, ParseTree declaration, String declarationType) {
            this.type = type;
            this.id = id;
            this.declaration = declaration;

            this.declarationType = declarationType;
        }

        @Override
        public String toString() {
            return String.format("[%s %s%s]", type, id, declarationType.equals("function") ? "()" : "");
        }
    }

    public Declaration simplifyDeclaration(DeclarationContext ctx) {
        if (ctx.varDecl() != null) {
            var globalDecl = ctx.varDecl();

            return new Declaration(convertType(globalDecl.type().getText()), globalDecl.ID().getText(), globalDecl, "var");
        }
        else if (ctx.functionDecl() != null) {
            return simplifyDeclaration(ctx.functionDecl());
        }
        return null;
    }

    public Declaration simplifyDeclaration(VarDeclContext ctx) {
        String declType = ctx.type().getText();
        String declId = ctx.ID().getText();

        return new Declaration(declType, declId, ctx, "function");
    }

    public Declaration simplifyDeclaration(FunctionDeclContext ctx) {
        String declType = ctx instanceof RunnableFunctionDeclContext ? "void" : ((ConsumerFunctionDeclContext) ctx).type().getText();
        String declId = ctx instanceof RunnableFunctionDeclContext ? ((RunnableFunctionDeclContext) ctx).ID().getText() : ((ConsumerFunctionDeclContext) ctx).ID().getText();

        return new Declaration(declType, declId, ctx, "function");
    }

    public Declaration getDeclaration(String id, ParseTree ctx) {
        var siblings = getToSiblingsOfType(ctx, FluxParser.DeclarationContext.class);

        if (!siblings.isEmpty()) {
            for (var sibling : siblings) {
                var myDeclaration = simplifyDeclaration(sibling);

                if (myDeclaration != null) {
                    if (id.equals(myDeclaration.id)) {
                        String type = convertType(myDeclaration.type);

                        return new Declaration(type, id, myDeclaration.declaration, myDeclaration.declarationType);
                    }
                }
            }
        }

        var funcSiblings = getToSiblingsOfType(ctx, FluxParser.FunctionDeclStatementContext.class);

        if (!funcSiblings.isEmpty()) {
            for (var sibling : funcSiblings) {
                var myDeclaration = simplifyDeclaration(sibling.functionDecl());

                if (myDeclaration != null) {
                    if (id.equals(myDeclaration.id)) {
                        String type = convertType(myDeclaration.type);

                        return new Declaration(type, id, myDeclaration.declaration, myDeclaration.declarationType);
                    }
                }
            }
        }

        var varSiblings = getToSiblingsOfType(ctx, FluxParser.VarDeclStatementContext.class);

        if (!varSiblings.isEmpty()) {
            for (var sibling : varSiblings) {
                var myDeclaration = simplifyDeclaration(sibling.varDecl());

                if (myDeclaration != null) {
                    if (id.equals(myDeclaration.id)) {
                        String type = convertType(myDeclaration.type);

                        return new Declaration(type, id, myDeclaration.declaration, myDeclaration.declarationType);
                    }
                }
            }
        }
        return null;
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
        String castString = "";
        for (var expression : ctx.expression()) {
            if (expression instanceof IdExprContext idExpr) {
                var declaration = getDeclaration(idExpr.qualifiedId().getText(), ctx);
                if (declaration != null && !declaration.type.equals("double")) {
                    castString = String.format("(%s) ", declaration.type);
                }
            }
        }
        return String.format("%sMath.pow(%s, %s)", castString, visit(ctx.expression(0)), visit(ctx.expression(1)));
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
    public String visitStringExpr(StringExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVoidBlock(VoidBlockContext ctx) {
        return visitBlock(ctx.statement(), null);
    }

    @Override
    public String visitReturnBlock(ReturnBlockContext ctx) {
        return visitBlock(ctx.statement(), ctx.expressionReturn().stream().map(ExpressionReturnContext::expression).collect(Collectors.toList()));
    }

    public String visitBlock(List<FluxParser.StatementContext> statement, List<ExpressionContext> expressions) {
        StringBuilder blockCode = new StringBuilder("{");
        javaCode.indentLevel++;
        for (var statementCtx : statement) {
            blockCode.append("\r").append("\t".repeat(javaCode.indentLevel)).append(visit(statementCtx));
        }
        if (expressions != null) {
            for (var expression : expressions) {
                blockCode.append("\r").append("\t".repeat(javaCode.indentLevel)).append(visit(expression));
            }
        }
        javaCode.indentLevel--;
        blockCode.append("\r").append("\t".repeat(javaCode.indentLevel)).append("}");
        return blockCode.toString();
    }

    @Override
    public String visitParenthesizedStatement(ParenthesizedStatementContext ctx) {
        return visit(ctx.statement());
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
    public String visitRunnableFunctionDecl(RunnableFunctionDeclContext ctx) {
        return visitFunction(
                convertType("void"),
                ctx.ID().getText(),
                ctx.formalParameters(),
                ctx.voidBlock(),
                ctx.functionModifiers()
        );
    }

    @Override
    public String visitConsumerFunctionDecl(ConsumerFunctionDeclContext ctx) {
        return visitFunction(
                convertType(ctx.type().getText()),
                ctx.ID().getText(),
                ctx.formalParameters(),
                ctx.returnBlock(),
                ctx.functionModifiers()
        );
    }

    public String visitFunction(String returnType, String functionName, FluxParser.FormalParametersContext formalParameters, ParseTree block, FluxParser.FunctionModifiersContext funcModifiers) {

        String parameters = "";
        if (formalParameters != null) {
            parameters = formalParameters.formalParameter().stream()
                    .map(this::visitFormalParameter)
                    .collect(Collectors.joining(", "));
        }

        String body = visit(block);

        String functionModifiers = parseFunctionModifiers(funcModifiers);

        return String.format("%s%s %s(%s) %s", functionModifiers, returnType, functionName, parameters, body);
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
        String localClassString = "";

        var sibling = getToClosestSibling(ctx.getParent(), FluxParser.FunctionDeclStatementContext.class);
        if (sibling != null) {
            var declaration = getDeclaration(ctx.qualifiedId().getText(), ctx);

            if (declaration != null) {

                var parent1 = firstNonNull(
                        getToClosestParent(declaration.declaration, RunnableFunctionDeclContext.class),
                        getToClosestParent(declaration.declaration, ConsumerFunctionDeclContext.class));
                var parent2 = firstNonNull(
                        getToClosestParent(ctx, RunnableFunctionDeclContext.class),
                        getToClosestParent(ctx, ConsumerFunctionDeclContext.class));
                if (parent1 != null && parent2 != null) {
                    if (declaration.id.equals(ctx.qualifiedId().getText()) && parent1.equals(parent2)) {
                        localClassString = String.format("_class_%s$%s.", declaration.id, sibling.functionDecl().hashCode());
                    }
                }
            }
        }

        String functionName = ctx.qualifiedId().getText();
        String args = "";
        if (ctx.expressionList() != null) {
            args = ctx.expressionList().expression().stream()
                    .map(this::visit)
                    .collect(Collectors.joining(", "));
        }
        return localClassString + functionName + "(" + args + ")";
    }

    public String visitFormalParameter(FluxParser.FormalParameterContext ctx) {
        return convertType(ctx.type().getText()) + " " + ctx.ID().getText();
    }

    @Override
    public String visitVoidReturnStatement(VoidReturnStatementContext ctx) {
        return "return;";
    }

    @Override
    public String visitExpressionReturnStatement(ExpressionReturnStatementContext ctx) {
        return "return " + visit(ctx.expressionReturn().expression()) + ";";
    }

    @Override
    public String visitFunctionDeclStatement(FunctionDeclStatementContext ctx) {
        var functionDecl = ctx.functionDecl();
        var declaration = simplifyDeclaration(functionDecl);
        javaCode.indentLevel++;
        String uniqueId = String.format("%s$%s", declaration.id, functionDecl.hashCode());
        String text = String.format("class _Class_%s {%s\n}\nvar _class_%s = new _Class_%s();", uniqueId, "\r" + "\t".repeat(javaCode.indentLevel) + visit(ctx.functionDecl()), uniqueId, uniqueId);
        javaCode.indentLevel--;
        return text;
    }

    @Override
    public String visitAssignmentStatement(FluxParser.AssignmentStatementContext ctx) {
        if (ctx.assignmentStat().expression(1) != null) {
            return String.format("%s[%s] = %s;", ctx.assignmentStat().qualifiedId().getText(), visit(ctx.assignmentStat().expression(1)), visit(ctx.assignmentStat().expression(0)));
        }
        else return String.format("%s = %s;", ctx.assignmentStat().qualifiedId().getText(), visit(ctx.assignmentStat().expression(0)));
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
        StringBuilder statementBuilder = new StringBuilder();

        if (ctx.expression() != null) {
            String expressionValue = visit(ctx.expression());
            for (String assertion : pendingAssertions) {
                statementBuilder.append(assertion).append("\n");
            }
            pendingAssertions.clear();

            statementBuilder.append(String.format("%s%s %s = %s;", variableModifiers, type, id, expressionValue));

        }  else {
            for (String assertion : pendingAssertions) {
                statementBuilder.append(assertion).append("\n");
            }
            pendingAssertions.clear();

            statementBuilder.append(String.format("%s%s %s;", variableModifiers, type, id));
        }
        return statementBuilder.toString();
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

    public static String convertType(String type) {
        if (type.equals("bool"))
            return "boolean";
        else if (type.equals("string"))
            return "String";
        return type;
    }

    @SafeVarargs
    public static <T> void Print(T... out) {
        StringBuilder builder = new StringBuilder();
        for (var o : out) {
            if (o instanceof ParseTree parseTree) {
                builder.append(parseTree.getText()).append(" ");
            }
            else builder.append(o).append(" ");
        }
        System.out.println(builder);
    }
}