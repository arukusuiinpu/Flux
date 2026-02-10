package net.norivensuu.flux.structure;

import net.norivensuu.flux.FluxBaseVisitor;
import net.norivensuu.flux.FluxCompiler;
import net.norivensuu.flux.utils.FluxUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.benf.cfr.reader.util.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Stream;

// TODO Eventually build "ANTLR4 -> (Object oriented DAG, actual Java classes) Flux IR Compiler (Development)
//  + (Linearized Topological DAG Data-Oriented Array Structure) Flux IR (actual compiling) -> ASM" Instead of just DAG
public abstract class FluxNode<T extends ParseTree> extends FluxBaseVisitor<Void> {

    public FluxCompiler.Program program;

    public T context;

    public int logLevel;

    public int discoveryOrder;

    public FluxNode(T context, FluxNode<?> parent) {
        super();

        if (parent != null) {
            program = parent.program;

            addParent(parent);

            logLevel = parent.logLevel + 1;
        }

        this.context = context;
    }
    public FluxNode() {
    }

    public List<FluxNode<?>> parents = new ArrayList<>();

    public void addParent(FluxNode<?> node) {
        parents.add(node);
    }
    public void resetParent(FluxNode<?> node) {
        parents.clear(); parents.add(node);
    }
    public void setParent(int index, FluxNode<?> node) {
        parents.set(index, node);
    }
    public void setParent(Class<? extends FluxNode<?>> clazz, FluxNode<?> node) {
        parents.stream().filter((entry) -> entry.getClass().equals(clazz)).forEachOrdered((fluxNode) -> parents.set(parents.indexOf(fluxNode), node));
    }

    public FluxNode<?> getParent(int index) {
        return parents.get(index);
    }
    @Nullable
    public FluxNode<?> getParent(Class<? extends FluxNode<?>> clazz) {
        return parents.stream().filter((entry) -> entry.getClass().equals(clazz)).findFirst().orElse(null);
    }

    public <V extends FluxNode<?>> V addChild(Class<V> clazz) {
        try {
            Constructor<V> ctor = clazz.getDeclaredConstructor(FluxNode.class);

            V node = ctor.newInstance(this);

            node.addParent(this);
            return node;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Subclass " + clazz.getSimpleName() +
                    " must have a constructor taking (FluxNode parent)", e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + clazz.getName(), e);
        }
    }
    public <V extends FluxNode<?>> void addChild(V node) {
        node.addParent(this);
    }

    @Override
    public String toString() {
        return String.format("%s[%s](%s)", getClass().getSimpleName(), discoveryOrder, CombineString(parents));
    }

    @Override
    public Void visit(ParseTree tree) {
        if (FluxCompiler.logTypes) {
            String info = "";
            for (var record : getRecords()) {
                if (record != null) {
                    info = String.format("%stype: %s", "\t".repeat(this.logLevel), record);
                }
            }
            if (!info.isEmpty()) {
                Print(info);
            }
        }

        return super.visit(tree);
    }

    public void visitSelf() {
        String logLevelString = "";
        if (logLevel > 0) {
            logLevelString = "\t".repeat(logLevel-1) + "┌─> ";
        }
        if (context != null) {
            visit(context);

            Print(logLevelString + String.format("%s[%s]", getClass().getSimpleName(), discoveryOrder), String.format("(%s)", context.getClass().getSimpleName()));
        }
        program.IR.addNode(this);
    }

    public static <V extends FluxNode<?>> V visit(V node) {
        node.visitSelf();
        return node;
    }

    @SafeVarargs
    protected static <V> void Print(V... out) {
        FluxUtils.Print(out);
    }

    @SafeVarargs
    protected static <V> String CombineString(V... out) {
        return FluxUtils.CombineString(out);
    }

    @SafeVarargs
    protected final <V> V firstNonNull(V... objects) {
        return FluxUtils.firstNonNull(objects);
    }

    public Record[] getRecords() {
        return Arrays.stream(this.getClass().getDeclaredFields())
                .filter(field -> field.getType().isRecord())
                .map(field -> {
                    try {
                        return (Record) field.get(this);
                    } catch (IllegalAccessException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toArray(Record[]::new);
    }

    public Record getRecord() {
        return firstNonNull(getRecords());
    }
}
