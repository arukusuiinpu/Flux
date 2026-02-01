package net.norivensuu.flux.structure;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.benf.cfr.reader.util.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

import static net.norivensuu.flux.utils.FluxUtils.CombineString;

public abstract class FluxNode {
    public FluxNode(FluxNode parent) {
        this.parent = parent;
    }
    public FluxNode() {
    }

    public FluxNode parent = null;
    public List<FluxNode> children = new ArrayList<>();

    public String resolvedDescriptor;

    public void setParent(FluxNode node) {
        parent = node;
    }

    public Set<FluxNode> getChildrenSet() {
        return new HashSet<>(children);
    }
    public Set<FluxNode> getChildrenSet(Class<? extends FluxNode> clazz) {
        return children.stream().filter((entry) -> entry.getClass().equals(clazz)).collect(Collectors.toSet());
    }

    public List<FluxNode> getChildrenList() {
        return new ArrayList<>(children);
    }
    public List<FluxNode> getChildrenList(Class<? extends FluxNode> clazz) {
        return children.stream().filter((entry) -> entry.getClass().equals(clazz)).collect(Collectors.toList());
    }

    @Nullable
    public FluxNode getChild(Class<? extends FluxNode> clazz, int index) {
        return getChildrenList(clazz).get(index);
    }
    @Nullable
    public FluxNode getFirstChild(Class<? extends FluxNode> clazz) {
        return getChild(clazz, 0);
    }
    @Nullable
    public FluxNode getLastChild(Class<? extends FluxNode> clazz) {
        return getChild(clazz, getChildrenList(clazz).size()-1);
    }
    @Nullable
    public FluxNode getFirstChild() {
        return getChild(0);
    }
    @Nullable
    public FluxNode getLastChild() {
        return getChild(getChildrenList().size()-1);
    }

    public FluxNode getChild(int index) {
        return getChildrenList().get(index);
    }
    public Class<? extends FluxNode> getChildClass(FluxNode node) {
        return node.getClass();
    }

    public <T extends FluxNode> T addChild(Class<T> clazz) {
        try {
            Constructor<T> ctor = clazz.getDeclaredConstructor(FluxNode.class);

            T node = ctor.newInstance(this);

            this.children.add(node);
            return node;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Subclass " + clazz.getSimpleName() +
                    " must have a constructor taking (FluxNode parent)", e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + clazz.getName(), e);
        }
    }
    public void addChild(FluxNode node) {
        node.setParent(this);
        children.add(node);
    }
    public void setChild(int index, FluxNode newNode) {
        if (index < 0 || index >= children.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for children list");
        }

        FluxNode oldChild = children.get(index);
        if (oldChild != null) {
            oldChild.parent = null;
        }

        newNode.parent = this;

        children.set(index, newNode);
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", getClass().getName(), CombineString(children));
    }

    public abstract void accept(FluxIRVisitor visitor);
}
