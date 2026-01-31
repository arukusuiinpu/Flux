package net.norivensuu.flux;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static net.norivensuu.flux.FluxParser.*;
import static net.norivensuu.flux.utils.FluxUtils.*;

public class JavaCodeGeneratorVisitor extends FluxBaseVisitor<String> {

    public static final class StandartFluxLibs {
        public static final String MATH_UTILS = "net.norivensuu.flux.utils.MathUtils.*";
        public static final String STATIC_MATH_UTILS = "static " + MATH_UTILS;
    }

    public final List<String> pendingAssertions = new ArrayList<>();

    public class JavaCode {
        public StringBuilder builder;
        public int indentLevel;
        public int atIndex;
        public int lastImportsLine;
        public boolean checkDeclarations = true;

        public Map<DeclarationContext, Integer> programDeclarations = new HashMap<>();
        
        public Map<ParseTree, Declaration> declarations = new HashMap<>();

        public JavaCode() {
            builder = new StringBuilder();
        }

        public StringBuilder addLine(String line, int at) {
            return builder.insert(at, String.format("%s%s\n", "\t".repeat(indentLevel), line));
        }

        public void checkDeclaration(DeclarationContext ctx, int lastIndex) {
            atIndex += lastIndex;
            programDeclarations.put(ctx, lastIndex);
        }

        public void resetJavaCode() {
//            indentLevel = 0;
            atIndex = 0;
            checkDeclarations = true;
        }

        public void HashDeclaration(ParseTree ctx, Declaration declaration) {
            if (!declarations.containsKey(ctx)) {
                declarations.put(ctx, declaration);
            }
        }
        public void HashDeclaration(String id, ParseTree ctx) {
            HashDeclaration(ctx, getDeclaration(id, ctx));
        }
        public void HashDeclaration(ParseTree ctx, String type, String id) {
            HashDeclaration(ctx, new Declaration(type, id, ctx));
        }

        @Override
        public String toString() {
            return builder.toString();
        }
    }

    public FluxCompiler.Program getProgram(ParseTree ctx) {
        return  FluxCompiler.getProgramRegistry().get(getToClosestParent(ctx, ProgramContext.class));
    }

    @Override
    public String visitProgram(FluxParser.ProgramContext ctx) {
        var program = FluxCompiler.getProgramRegistry().get(ctx);
        program.javaCode = new JavaCode();

        if (!ctx.statement().isEmpty()) {
            synthesizeMainFunction(ctx.statement(), ctx);
        }

        while (program.javaCode.checkDeclarations) {
            program.javaCode.resetJavaCode();
            program.javaCode.checkDeclarations = false;

            for (var declaration : ctx.declaration()) {
                if (declaration.importDecl() != null) {
                    mapDeclarations(declaration.importDecl(), program);
                }
            }
            for (var declaration : ctx.declaration()) {
                if (declaration.functionDecl() != null) {
                    mapDeclarations(declaration.functionDecl(), program);
                }
            }
            for (var declaration : ctx.declaration()) {
                if (declaration.varDecl() != null) {
                    mapDeclarations(declaration.varDecl(), program);
                }
            }

            for (var decl : ctx.declaration()) {
                processDeclaration(decl, program);
            }
        }

        return program.javaCode.toString();
    }

    public void mapDeclarations(ParseTree ctx, FluxCompiler.Program program) {
        if (ctx != null) {
            var declaration = simplifyDeclaration(ctx);

            if (declaration != null) {
                program.javaCode.HashDeclaration(ctx, declaration);
                }

            for (int i = 0; i < ctx.getChildCount(); i++) {
                mapDeclarations(ctx.getChild(i), program);
            }
        }
    }

    public Declaration simplifyDeclaration(LocalVarDeclContext ctx) {
        if (ctx != null) {

            var type = simplifyLocalVarType(ctx);

            return new Declaration(type.type, type.id, ctx, "var");
        }
        return null;
    }

    public Declaration simplifyDeclaration(DeclarationContext ctx) {
        if (ctx.varDecl() != null) {
            var globalDecl = ctx.varDecl();

            var localType = simplifyLocalVarType(ctx.varDecl().localVarDecl());

            return new Declaration(localType.type, localType.id, globalDecl, "var");
        }
        else if (ctx.functionDecl() != null) {
            return simplifyDeclaration(ctx.functionDecl());
        }
        else if (ctx.importDecl() != null) {
            return simplifyDeclaration(ctx.importDecl());
        }
        return null;
    }

    public Declaration simplifyDeclaration(ImportDeclContext ctx) {
        String declType = String.format("import%s", ctx.qualifiedId().getText().startsWith("static") ? " static" : "");
        String declId = ctx.qualifiedId().getText().replace("static ", "");

        return new Declaration(declType, declId, ctx, "library");
    }

    public Declaration simplifyDeclaration(VarDeclContext ctx) {
        var localType = simplifyLocalVarType(ctx.localVarDecl());

        return new Declaration(localType.type, localType.id, ctx, "var");
    }

    public Declaration simplifyDeclaration(FunctionDeclContext ctx) {

        String type = "";
        if (ctx instanceof RunnableFunctionDeclContext decl) {
            type = decl.VOID().getText();
        }
        else if (ctx instanceof ConsumerFunctionDeclContext decl) {
            type = visit(decl.type());
        }
        else if (ctx instanceof VarFunctionDeclContext decl) {
            Set<String> types = new HashSet<>();

            collectReturnTypes(decl.returnBlock(), types);

            if (types.size() == 1) {
                type = types.stream().findFirst().get();
            } else {
                type = "illegal";
            }
        }

        String id = "";
        if (ctx instanceof RunnableFunctionDeclContext decl) {
            id = decl.ID().getText();
        }
        else if (ctx instanceof ConsumerFunctionDeclContext decl) {
            id = decl.ID().getText();
        }
        else if (ctx instanceof VarFunctionDeclContext decl) {
            id = decl.ID().getText();
        }

        return new Declaration(type, id, ctx, "function");
    }

    private void collectReturnTypes(ParseTree ctx, Set<String> types) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            var child = ctx.getChild(i);

            if (child instanceof ExpressionReturnContext ret) {
                types.add(getAutoType(ret.expression()));
            }
            collectReturnTypes(child, types);
        }
    }

    public Declaration simplifyDeclaration(Object ctx) {
        if (ctx instanceof LocalVarDeclContext decl) {
            return simplifyDeclaration(decl);
        }
        else if (ctx instanceof DeclarationContext decl) {
            return simplifyDeclaration(decl);
        }
        else if (ctx instanceof VarDeclContext decl) {
            return simplifyDeclaration(decl);
        }
        else if (ctx instanceof FunctionDeclContext decl) {
            return simplifyDeclaration(decl);
        }
        else if (ctx instanceof ImportDeclContext decl) {
            return simplifyDeclaration(decl);
        }
        return null;
    }

    private boolean hasIDField(Object obj) {
        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            try {
                clazz.getDeclaredField("ID");
                return true;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        }
        return false;
    }

    private void processDeclaration(FluxParser.DeclarationContext declarationCtx, FluxCompiler.Program program) {
        if (program.javaCode.checkDeclarations) return;

        if (!program.javaCode.programDeclarations.containsKey(declarationCtx)) {
            String javaString = "";

            if (declarationCtx.importDecl() != null) {
                javaString = visit(declarationCtx.importDecl());
                program.javaCode.addLine(javaString, program.javaCode.atIndex);
                program.javaCode.lastImportsLine += javaString.length() + 1;
            } else if (declarationCtx.functionDecl() != null) {
                String functionCode = visit(declarationCtx.functionDecl());
                if (functionCode != null) {
                    javaString = functionCode.replace("\n", "\n    ").trim();
                    program.javaCode.addLine(javaString, program.javaCode.atIndex);
                }
            } else if (declarationCtx.varDecl() != null) {
                javaString = visit(declarationCtx.varDecl());
                program.javaCode.addLine(javaString, program.javaCode.atIndex);
            }

            program.javaCode.checkDeclaration(declarationCtx, javaString.length() + 1);
        } else {
            program.javaCode.atIndex += program.javaCode.programDeclarations.get(declarationCtx);
        }
    }

    @Override
    public String visitType(TypeContext ctx) {
        StringBuilder builder = new StringBuilder();
        if (!ctx.type().isEmpty()) {
            builder.append(visit(ctx.type(0))).append("<").append(visit(ctx.type(1))).append(">");
        }
        else {
            if (ctx.qualifiedId() != null)
                return convertType(visit(ctx.qualifiedId()));

            return convertType(ctx.getText());
        }

        return builder.toString();
    }

    private FluxParser.DeclarationContext synthesizeMainFunction(List<FluxParser.StatementContext> statements, FluxParser.ProgramContext parent) {
        FluxParser.DeclarationContext declCtx = new FluxParser.DeclarationContext(parent, -1);

        FluxParser.FunctionDeclContext funcDecl = new FluxParser.FunctionDeclContext(declCtx, -1);

        FluxParser.RunnableFunctionDeclContext mainFunc = new FluxParser.RunnableFunctionDeclContext(funcDecl);

        FluxParser.FunctionModifiersContext modifiers = new FluxParser.FunctionModifiersContext(funcDecl, -1);

        FluxParser.AccessModifierContext accessCtx = new FluxParser.AccessModifierContext(modifiers, -1);

        accessCtx.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__0, "public")));

        modifiers.addChild(accessCtx);

        mainFunc.addChild(modifiers);

        mainFunc.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.VOID, "void")));
        TerminalNodeImpl idNode = new TerminalNodeImpl(new CommonToken(FluxLexer.ID, "main"));
        mainFunc.addChild(idNode);

        mainFunc.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__1, "(")));
        mainFunc.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__2, ")")));

        FluxParser.VoidBlockContext voidBlock = new FluxParser.VoidBlockContext(mainFunc, -1);
        voidBlock.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__3, "{"))); // '{'

        for (FluxParser.StatementContext stmt : statements) {
            voidBlock.addChild(stmt);
            stmt.parent = voidBlock;
        }

        voidBlock.addChild(new TerminalNodeImpl(new CommonToken(FluxLexer.T__4, "}"))); // '}'

        mainFunc.addChild(voidBlock);
        funcDecl.addChild(mainFunc);
        declCtx.addChild(funcDecl);

        if (parent.children == null) {
            parent.addChild(declCtx);
        } else {
            parent.children.add(declCtx);
        }

        return declCtx;
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
    public String visitQualifiedId(QualifiedIdContext ctx) {
        return ctx.getText();
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
    public String visitVariableAccessExpr(VariableAccessExprContext ctx) {
        return String.format("%s.%s", visit(ctx.expression(0)), visit(ctx.expression(1)));
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
        return String.format("(%s)%s", visit(ctx.type()), visit(ctx.expression()));
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
            var localType = simplifyLocalVarType(varDecl.localVarDecl());

            type = localType.type;
        }
        var varStatDecl = getToClosestParent(ctx, FluxParser.VarDeclStatementContext.class);
        if (varStatDecl != null) {
            var localType = simplifyLocalVarType(varStatDecl.varDecl().localVarDecl());

            type = localType.type;
        }
        var assignmentStat = getToClosestParent(ctx, FluxParser.AssignmentStatContext.class);
        if (assignmentStat != null) {
            var assignment = getAssignment(assignmentStat);

            var declaration = getDeclaration(assignment.qualifiedId.getText(), ctx);
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

    public static class LocalVarType {
        public String type;
        public String id;
        public ExpressionContext expression;

        public LocalVarType(String type, String id, ExpressionContext expression) {
            this.type = type;
            this.id = id;
            this.expression = expression;
        }

        @Override
        public String toString() {
            return String.format("<%s %s>", type, id);
        }
    }

    public LocalVarType simplifyLocalVarType(LocalVarDeclContext ctx) {
        if (ctx instanceof StrictlyTypedLocalVarContext localCtx) {
            return new LocalVarType(visit(localCtx.type()), localCtx.ID().getText(), localCtx.expression());
        }
        else if (ctx instanceof LooselyTypedLocalVarContext localCtx) {
            return new LocalVarType(getAutoType(localCtx.expression()), localCtx.ID().getText(), localCtx.expression());
        }
        return null;
    }


    public int whatParameterAmI(ParseTree ctx, List<ExpressionContext> expressions) {
        for (int i = 0; i < expressions.size(); i++) {
            if (expressions.get(i).equals(ctx)) return i;
        }
        return -1;
    }
    public int whatParameterAmI(ParseTree ctx,  FluxParser.ExpressionListContext parent) {
        return whatParameterAmI(ctx, parent.expression());
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

    public Declaration getDeclaration(ParseTree ctx) {
        var program = getProgram(ctx);

        return program.javaCode.declarations.get(ctx);
    }

    public Declaration getDeclaration(String id, ParseTree ctx) {
        var program = getProgram(ctx);

        var declaration = program.javaCode.declarations.values().stream().filter((d) -> d.id.equals(id)).findFirst();

        if (declaration.isEmpty()) {
            var funcSiblings = getToSiblingsOfType(ctx, FluxParser.FunctionDeclStatementContext.class);
            if (!funcSiblings.isEmpty()) {
                for (var sibling : funcSiblings) {
                    var myDeclaration = simplifyDeclaration(sibling.functionDecl());

                    if (myDeclaration != null) {
                        if (id.equals(myDeclaration.id)) {
                            String type = convertType(myDeclaration.type);

                            program.javaCode.HashDeclaration(ctx, type, id);
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

                            program.javaCode.HashDeclaration(ctx, type, id);
                            return new Declaration(type, id, myDeclaration.declaration, myDeclaration.declarationType);
                        }
                    }
                }
            }

            var siblings = getToSiblingsOfType(ctx, FluxParser.DeclarationContext.class);
            if (!siblings.isEmpty()) {
                for (var sibling : siblings) {
                    var myDeclaration = simplifyDeclaration(sibling);

                    if (myDeclaration != null) {
                        if (id.equals(myDeclaration.id)) {
                            String type = convertType(myDeclaration.type);

                            program.javaCode.HashDeclaration(ctx, type, id);
                            return new Declaration(type, id, myDeclaration.declaration, myDeclaration.declarationType);
                        }
                    }
                }
            }
        }
        else return declaration.get();

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
        return visitExp(ctx.expression(0), ctx.expression(1), ctx);
    }

    public String visitExp(Object exp1, Object exp2, ParseTree ctx) {
        ensureImport(ctx, StandartFluxLibs.STATIC_MATH_UTILS);

        return visitBinaryOp(exp1, exp2, ctx,
                (e1, e2) -> String.format("power(%s, %s)", e1, e2));
    }

    @Override
    public String visitTetrExpr(TetrExprContext ctx) {
        return visitTetr(ctx.expression(0), ctx.expression(1), ctx);
    }

    public String visitTetr(Object exp1, Object exp2, ParseTree ctx) {
        ensureImport(ctx, StandartFluxLibs.STATIC_MATH_UTILS);

        return visitBinaryOp(exp1, exp2, ctx,
                (e1, e2) -> String.format("estimateTetration(%s, %s)", e1, e2));
    }

    public FluxParser.DeclarationContext ensureImport(ParseTree ctx, String importPath) {
        return ensureImport(getProgram(ctx), importPath);
    }
    public FluxParser.DeclarationContext ensureImport(FluxCompiler.Program program, String importPath) {
        if (program != null && !program.imports.contains(importPath)) {
            var declarationCtx = program.addImport(importPath);

            FluxParser.ImportDeclContext declCtx = declarationCtx.importDecl();

            int indent = program.javaCode.indentLevel;

            String javaString = visit(declCtx);

            program.javaCode.indentLevel = 0;
            program.javaCode.addLine(javaString, program.javaCode.lastImportsLine);
            program.javaCode.indentLevel = indent;

            int index = javaString.length()+1;

            program.javaCode.lastImportsLine += index;
            program.javaCode.checkDeclaration(declarationCtx, index);

            return declarationCtx;
        }
        return null;
    }

    @Override
    public String visitFloorDivExpr(FloorDivExprContext ctx) {
        return visitFloorDiv(ctx.expression(0), ctx.expression(1), ctx);
    }

    public String visitFloorDiv(Object exp1, Object exp2, ParseTree ctx) {
        return visitBinaryOp(exp1, exp2, ctx,
                (e1, e2) -> String.format("Math.floor(%s / %s)", e1, e2));
    }

    @Override
    public String visitCeilDivExpr(CeilDivExprContext ctx) {
        return visitCeilDiv(ctx.expression(0), ctx.expression(1), ctx);
    }

    @Override
    public String visitCreationExpr(CreationExprContext ctx) {
        String args = "";
        if (ctx.expressionList() != null) {
            args = ctx.expressionList().expression().stream()
                    .map(this::visit)
                    .collect(Collectors.joining(", "));
        }

        String block = "";
        if (ctx.block() != null) {
            block = visit(ctx.block());
        }

        String typeString = visit(ctx.type());
        var declarationContext = getToClosestParent(ctx, VarDeclContext.class);
        if (declarationContext != null) {
            var declaration = simplifyDeclaration(declarationContext);

            getProgram(ctx).javaCode.HashDeclaration(ctx, declaration);
            var type = declaration.type;
            if (!type.isEmpty() && ctx.type().type().isEmpty()) {
                typeString = typeString + "<>";
            }
        }

        return String.format("new %s(%s) %s", typeString, args, block);
    }

    public String visitCeilDiv(Object exp1, Object exp2, ParseTree ctx) {
        return visitBinaryOp(exp1, exp2, ctx,
                (e1, e2) -> String.format("Math.ceil(%s / %s)", e1, e2));
    }

    public String getCastString(ParseTree ctx, Object... expressions) {
        String castString = "";
        for (var expression : expressions) {
            if (expression instanceof String) {
                continue;
            }

            QualifiedIdContext qualifiedId = null;
            if (expression instanceof IdExprContext idExpr) {
                qualifiedId = idExpr.qualifiedId();
            } else if (expression instanceof QualifiedIdContext idExpr) {
                qualifiedId = idExpr;
            }

            if (qualifiedId != null) {
                var declaration = getDeclaration(qualifiedId.getText(), ctx);
                if (declaration != null && !declaration.type.equals("double")) {
                    castString = String.format("(%s) ", declaration.type);
                }
            }
        }
        return castString;
    }

    public String getAutoType(Object object) {
        String type = object.toString();
        if (object instanceof IdExprContext expr) {
            type = expr.getText();
        }
        else if (object instanceof IntExprContext expr) {
            type = "int";
        }
        else if (object instanceof DecimalExprContext expr) {
            if (expr.getText().toLowerCase().contains("f")) {
                type = "float";
            }
            else {
                type = "double";
            }
        }
        else if (object instanceof BoolExprContext expr) {
            type = "boolean";
        }
        else if (object instanceof StringExprContext expr) {
            type = "String";
        }
        else if (object instanceof CharExprContext expr) {
            type = "char";
        }
        else if (object instanceof TetrExprContext expr) {
            var expressions = expr.expression();
            for (var parameter : expressions) {
                if (parameter instanceof IdExprContext idExpr) {
                    var declaration = getDeclaration(idExpr.qualifiedId().getText(), expr);

                    if (declaration != null) {
                        type = convertType(declaration.type);
                        break;
                    }
                }
            }
        }
        else if (object instanceof FunctionCallExprContext expr) {
            var declaration = getDeclaration(expr.qualifiedId().getText(), expr);

            if (declaration != null) {
                type = declaration.type;
            }
        }
        else if (object instanceof VarFunctionDeclContext expr) {
            var declaration = simplifyDeclaration(expr);

            if (declaration != null) {
                type = declaration.type;
            }
        }
        else if (object instanceof ParseTree expr) {
            type = "var";
        }

        return convertType(type); // Just to be safe
    }

    private String visitBinaryOp(Object exp1, Object exp2, ParseTree ctx, BiFunction<String, String, String> formatter) {
        String str1 = (exp1 instanceof String s) ? s : (exp1 instanceof ParseTree t) ? visit(t) : null;
        String str2 = (exp2 instanceof String s) ? s : (exp2 instanceof ParseTree t) ? visit(t) : null;

        if (str1 == null || str2 == null) return null;

        String castString = getCastString(ctx, exp1, exp2);
        return castString + formatter.apply(str1, str2);
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
        return String.format("\"%s\"", ctx.getText().substring(1, ctx.getText().length()-1)).replace("\\'", "'");
    }

    @Override
    public String visitCharExpr(CharExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVoidBlockStatement(VoidBlockStatementContext ctx) {
        return visitBlock(ctx, ctx.voidBlock().voidLines());
    }

    @Override
    public String visitVoidBlock(VoidBlockContext ctx) {
        return visitBlock(ctx, ctx.voidLines());
    }

    @Override
    public String visitReturnBlock(ReturnBlockContext ctx) {
        return visitBlock(ctx, ctx.expressionLines());
    }

    @Override
    public String visitExpressionReturn(ExpressionReturnContext ctx) {
        return String.format("return %s;", visit(ctx.expression()));
    }

    public String visitBlock(ParseTree ctx, ParseTree lines) {
        var program = getProgram(ctx);

        StringBuilder blockCode = new StringBuilder("{");
        program.javaCode.indentLevel++;
        for (int i = 0; i < lines.getChildCount(); i++) {
            var line = lines.getChild(i);
            if (line != null && !(line instanceof TerminatorContext)) {
                blockCode.append("\r").append("\t".repeat(program.javaCode.indentLevel)).append(visit(line));
            }
        }
        program.javaCode.indentLevel--;
        blockCode.append("\r").append("\t".repeat(program.javaCode.indentLevel)).append("}");
        return blockCode.toString();
    }

    @Override
    public String visitVarDeclStatement(FluxParser.VarDeclStatementContext ctx) {
        return visitVarDecl(ctx.varDecl());
    }

    @Override
    public String visitIfStatement(FluxParser.IfStatementContext ctx) {
        StringBuilder builderElseifString = new StringBuilder();
        for (int i = 1; i < ctx.expression().size(); i++) {
            builderElseifString.append(String.format("else if (%s) %s", visit(ctx.expression(i)), visit(ctx.block(i))));
        }
        String elseString = "";
        if (ctx.else_ != null) {
            elseString = String.format("else %s", visit(ctx.block(ctx.block().size()-1)));
        }
        return String.format("if (%s) %s%s%s", visit(ctx.expression(0)), visit(ctx.block(0)), builderElseifString, elseString);
    }

    @Override
    public String visitForStatement(ForStatementContext ctx) {
        return String.format("for (%s; %s; %s) %s", visit(ctx.localVarDecl()), visit(ctx.expression()), visit(ctx.assignmentStat()), visit(ctx.block()));
    }

    @Override
    public String visitForeachStatement(ForeachStatementContext ctx) {
        return String.format("for (%s %s : %s) %s", ctx.type() != null ? visit(ctx.type()) : "var", visit(ctx.ID()), visit(ctx.expression()), visit(ctx.block()));
    }

    @Override
    public String visit(ParseTree ctx) {
        if (ctx instanceof TerminalNodeImpl terminalNode) return terminalNode.getText();

        return super.visit(ctx);
    }

    @Override
    public String visitRunnableFunctionDecl(RunnableFunctionDeclContext ctx) {
        getProgram(ctx).javaCode.HashDeclaration(ctx, simplifyDeclaration(ctx));
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
        getProgram(ctx).javaCode.HashDeclaration(ctx, simplifyDeclaration(ctx));
        return visitFunction(
                visit(ctx.type()),
                ctx.ID().getText(),
                ctx.formalParameters(),
                ctx.returnBlock(),
                ctx.functionModifiers()
        );
    }

    @Override
    public String visitVarFunctionDecl(VarFunctionDeclContext ctx) {
        getProgram(ctx).javaCode.HashDeclaration(ctx, simplifyDeclaration(ctx));
        return visitFunction(
                getAutoType(ctx),
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
        return visit(ctx.type()) + " " + ctx.ID().getText();
    }

    @Override
    public String visitVoidReturnStatement(VoidReturnStatementContext ctx) {
        return "return;";
    }

    @Override
    public String visitUnaryAssigmnent(UnaryAssigmnentContext ctx) {
        return String.format("%s%s", ctx.qualifiedId().getText(), ctx.operator.getText());
    }

    @Override
    public String visitExpressionReturnStatement(ExpressionReturnStatementContext ctx) {
        return "return " + visit(ctx.expressionReturn().expression()) + ";";
    }

    @Override
    public String visitFunctionDeclStatement(FunctionDeclStatementContext ctx) {
        var program = getProgram(ctx);

        var functionDecl = ctx.functionDecl();
        var declaration = simplifyDeclaration(functionDecl);
        program.javaCode.HashDeclaration(ctx, declaration);

        program.javaCode.indentLevel++;
        String uniqueId = String.format("%s$%s", declaration.id, functionDecl.hashCode());
        String text = String.format("class _Class_%s {%s\n}\nvar _class_%s = new _Class_%s();", uniqueId, "\r" + "\t".repeat(program.javaCode.indentLevel) + visit(ctx.functionDecl()), uniqueId, uniqueId);
        program.javaCode.indentLevel--;

        return text;
    }

    @Override
    public String visitAssignmentStatement(FluxParser.AssignmentStatementContext ctx) {
        var assignment = getAssignment(ctx);

        if (assignment != null) {
            if (assignment.assignmentType.equals("default")) {
                String idString = assignment.qualifiedId.getText();

                return String.format("%s %s %s;", idString, assignment.operator, visit(assignment.expression));
            }
            else if (assignment.assignmentType.equals("exp")) {
                String idString = assignment.qualifiedId.getText();

                return String.format("%s = %s;", idString, visitExp(assignment.qualifiedId, assignment.expression, ctx));
            }
            else if (assignment.assignmentType.equals("floorDiv")) {
                String idString = assignment.qualifiedId.getText();

                return String.format("%s = %s;", idString, visitExp(assignment.qualifiedId, assignment.expression, ctx));
            }
        }
        return "";
    }

    public Assignment getAssignment(FluxParser.AssignmentStatContext ctx) {
        if (ctx instanceof DefaultAssigmnentContext assignment) {
            return new Assignment(assignment.qualifiedId(), assignment.expression(), assignment.operator, "default");
        }
        else if (ctx instanceof ExpAssigmnentContext assignment) {
            return new Assignment(assignment.qualifiedId(), assignment.expression(), assignment.operator, "exp");
        }
        else if (ctx instanceof FloorDivAssigmnentContext assignment) {
            return new Assignment(assignment.qualifiedId(), assignment.expression(), assignment.operator, "floorDiv");
        }
        else if (ctx instanceof CeilDivAssigmnentContext assignment) {
            return new Assignment(assignment.qualifiedId(), assignment.expression(), assignment.operator, "ceilDiv");
        }
        return null;
    }
    public Assignment getAssignment(FluxParser.AssignmentStatementContext ctx) {
        return getAssignment(ctx.assignmentStat());
    }

    public class Assignment {
        public QualifiedIdContext qualifiedId;
        public String assignmentType;

        public ExpressionContext expression;
        public String operator;

        public Assignment(QualifiedIdContext qualifiedId, ExpressionContext expression, Token operator, String assignmentType) {
            this.qualifiedId = qualifiedId;
            this.assignmentType = assignmentType;
            this.expression = expression;
            this.operator = operator.getText();
        }
    }

    @Override
    public String visitExpressionStatement(FluxParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression()) + ";";
    }

    @Override
    public String visitVarDecl(FluxParser.VarDeclContext ctx) {
        String variableModifiers = parseVariableModifiers(ctx.variableModifiers());
        return visitVar(ctx.localVarDecl(), variableModifiers, true) + ";";
    }

    @Override
    public String visitLooselyTypedLocalVar(LooselyTypedLocalVarContext ctx) {
        return visitVar(ctx, "", false);
    }

    @Override
    public String visitStrictlyTypedLocalVar(StrictlyTypedLocalVarContext ctx) {
        return visitVar(ctx, "", false);
    }

    public String visitVar(LocalVarDeclContext ctx, String variableModifiers, boolean globalDecl) {
        var localType = simplifyLocalVarType(ctx);

        String type = localType.type;
        String id = localType.id;
        getProgram(ctx).javaCode.HashDeclaration(ctx, type, id);

        ExpressionContext expression = null;
        if (ctx instanceof StrictlyTypedLocalVarContext localCtx) {
            expression = localCtx.expression();
        }
        else
        if (ctx instanceof LooselyTypedLocalVarContext localCtx) {
            expression = localCtx.expression();
        }

        StringBuilder statementBuilder = new StringBuilder();

        if (expression != null) {

            String expressionValue = visit(expression);

            if (globalDecl && type.equals("var")) {
                type = getAutoType(expression);
            }

            for (String assertion : pendingAssertions) {
                statementBuilder.append(assertion).append("\n");
            }
            pendingAssertions.clear();

            statementBuilder.append(String.format("%s%s %s = %s", variableModifiers, type, id, expressionValue));

        }  else {
            for (String assertion : pendingAssertions) {
                statementBuilder.append(assertion).append("\n");
            }
            pendingAssertions.clear();

            statementBuilder.append(String.format("%s%s %s", variableModifiers, type, id));
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
}