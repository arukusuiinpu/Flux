package net.norivensuu.flux.visitors;

import net.norivensuu.flux.FluxBaseVisitor;
import net.norivensuu.flux.FluxParser;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ASMJavaCodeVisitor extends FluxBaseVisitor<Void> {
    private final ClassWriter cw;
    private final String className;

    public ASMJavaCodeVisitor(ClassWriter cw, String className) {
        this.cw = cw;
        this.className = className;
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

        super.visitProgram(ctx);

        cw.visitEnd();
        return null;
    }
}
