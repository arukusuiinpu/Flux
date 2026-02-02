package net.norivensuu.flux.structure;

import net.norivensuu.flux.FluxBaseVisitor;
import net.norivensuu.flux.utils.FluxUtils;
import net.norivensuu.flux.asm.ASMJavaCodeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.benf.cfr.reader.util.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.util.*;

// TODO Eventually build "ANTLR4 -> (Object oriented DAG, actual Java classes) Flux IR Compiler (Development)
//  + (Linearized Topological DAG Data-Oriented Array Structure) Flux IR (actual compiling) -> ASM" Instead of just DAG
public abstract class FluxNode<T extends ParseTree> extends FluxBaseVisitor<Void> {

    public ASMJavaCodeVisitor asm;

    public T context;

    int logLevel = 0;

    public FluxNode(T context, FluxNode<?> parent) {
        super();

        if (parent != null) {
            addParent(parent);

            logLevel = parent.logLevel + 1;
        }

        this.context = context;
    }
    public FluxNode() {
    }

    public List<FluxNode> parents = new ArrayList<>();

    public void addParent(FluxNode node) {
        parents.add(node);
    }
    public void resetParent(FluxNode node) {
        parents.clear(); parents.add(node);
    }
    public void setParent(int index, FluxNode node) {
        parents.set(index, node);
    }
    public void setParent(Class<? extends FluxNode> clazz, FluxNode node) {
        parents.stream().filter((entry) -> entry.getClass().equals(clazz)).forEachOrdered((fluxNode) -> parents.set(parents.indexOf(fluxNode), node));
    }

    public void getParent(int index) {
        parents.get(index);
    }
    @Nullable
    public FluxNode getParent(Class<? extends FluxNode> clazz) {
        return parents.stream().filter((entry) -> entry.getClass().equals(clazz)).findFirst().orElse(null);
    }

    public <T extends FluxNode> T addChild(Class<T> clazz) {
        try {
            Constructor<T> ctor = clazz.getDeclaredConstructor(FluxNode.class);

            T node = ctor.newInstance(this);

            node.addParent(this);
            return node;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Subclass " + clazz.getSimpleName() +
                    " must have a constructor taking (FluxNode parent)", e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + clazz.getName(), e);
        }
    }
    public <T extends FluxNode> void addChild(T node) {
        node.addParent(this);
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", getClass().getName(), CombineString(parents));
    }

    @Override
    public Void visit(ParseTree tree) {
        return super.visit(tree);
    }

    public Void visitSelf() {

        String logLevelString = "";
        if (logLevel > 0) {
            logLevelString = "\t".repeat(logLevel-1) + "└─>";
        }
        Print(logLevelString, getClass().getSimpleName(), String.format("(%s)", context.getClass().getSimpleName()));

        return visit(context);
    }

    public static Void visit(FluxNode<?> node) {
        return node.visitSelf();
    }

    @SafeVarargs
    protected static <T> void Print(T... out) {
        FluxUtils.Print(out);
    }

    @SafeVarargs
    protected static <T> String CombineString(T... out) {
        return FluxUtils.CombineString(out);
    }
}
