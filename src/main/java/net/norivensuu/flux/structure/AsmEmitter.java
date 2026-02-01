package net.norivensuu.flux.structure;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

public class AsmEmitter implements FluxIRVisitor {
    private ClassWriter cw;
    private MethodVisitor mv;
}