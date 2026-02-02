package net.norivensuu.flux.asm;

import net.norivensuu.flux.FluxBaseVisitor;
import net.norivensuu.flux.FluxParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static net.norivensuu.flux.utils.FluxUtils.*;

public class ASMJavaCodeVisitor extends FluxBaseVisitor<Void> {
    private final ClassWriter cw;
    private final String className;

    public ASMJavaCodeVisitor(ClassWriter cw, String className) {
        this.cw = cw;
        this.className = className;
    }

    @Override
    public Void visit(ParseTree tree) {
        Print(tree.getClass().getSimpleName());
        return super.visit(tree);
    }

    @Override
    public Void visitProgram(FluxParser.ProgramContext ctx) {
        cw.visit(Opcodes.V22, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, className, null, "java/lang/Object", null);

        MethodVisitor init = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        init.visitCode();
        init.visitVarInsn(Opcodes.ALOAD, 0);
        init.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        init.visitInsn(Opcodes.RETURN);
        init.visitMaxs(1, 1);
        init.visitEnd();

        cw.visitEnd();

        for (var statement : ctx.statement()) {
            visit(statement);
        }

        return super.visitProgram(ctx);
    }
}
