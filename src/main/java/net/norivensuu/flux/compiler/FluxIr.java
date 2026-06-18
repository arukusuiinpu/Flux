package net.norivensuu.flux.compiler;

import net.norivensuu.flux.antlr.FluxBaseVisitor;
import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.ir.EmptyIrNode;
import net.norivensuu.flux.ir.SimpleIrNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static net.norivensuu.flux.utils.FluxUtils.*;
import static net.norivensuu.flux.antlr.FluxParser.*;

public class FluxIr<V> {
    public File irFile;
    public StringBuilder irString = new StringBuilder();
    public boolean logIr = false;

    public FluxBaseVisitor<IrNode<V, ? extends ParserRuleContext>> generator;

    public interface IrVisitor<T> {
        void setIr(FluxIr<?> ir);
        FluxIr<T> getIr();

        default <K extends ParserRuleContext> IrNode<T, K> of(K ctx, Function<IrNode<T, K>, T> tokenize) {
            return getIr().of(ctx, tokenize);
        }
        default <K extends ParserRuleContext> IrNode<T, K> of(K ctx, Class<? extends IrNode<T, K>> nodeClass) {
            return getIr().of(ctx, nodeClass);
        }
        default <K extends ParserRuleContext> IrNode<T, K> of(K ctx, T nodeToken) {
            return getIr().of(ctx, nodeToken);
        }
    }

    public FluxIr(FluxBaseVisitor<IrNode<V, ? extends ParserRuleContext>> generator) {
        if (generator instanceof IrVisitor<?> irVisitor) {
            irVisitor.setIr(this);
        }
        this.irFile = null;
        this.generator = generator;
    }

    public FluxIr(FluxBaseVisitor<IrNode<V, ? extends ParserRuleContext>> generator, File irFile) {
        if (generator instanceof IrVisitor<?> irVisitor) {
            irVisitor.setIr(this);
        }
        this.generator = generator;
        this.irFile = irFile;
        this.logIr = true;

        if (this.logIr) {
            try {
                Files.writeString(irFile.toPath(), "");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public V visit(FluxParser.ProgramContext programContext) {
        return visit(generator.visit(programContext));
    }

    public <T, K extends ParserRuleContext> T visit(IrNode<T, K> node) {
        return node.visit();
    }

    public <K extends ParserRuleContext> IrNode<V, K> of(K ctx, Class<? extends IrNode<V, K>> nodeClass) {
        try {
            return nodeClass.getDeclaredConstructor(this.getClass(), ctx.getClass()).newInstance(this, ctx);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            var mod = nodeClass.getModifiers();

            if (Modifier.isAbstract(mod)) {
                e.initCause(new InstantiationException(String.format("The class %s is abstract, cannot instantiate.", nodeClass)));
            }
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            e.initCause(new NoSuchMethodException(String.format("Can't find constructor with parameters: %s in the %s. Make sure to add it.", List.of(this.getClass().getSimpleName(), ctx.getClass().getSimpleName()), nodeClass)));

            throw new RuntimeException(e);
        }
    }

    public <K extends ParserRuleContext> IrNode<V, K> of(K ctx, Function<IrNode<V, K>, V> tokenizer) {
        return new SimpleIrNode<>(this, ctx, tokenizer);
    }
    public <K extends ParserRuleContext> IrNode<V, K> of(K ctx, V nodeToken) {
        return of(ctx, (s) -> nodeToken);
    }

    public abstract static class IrNode<T, K extends ParserRuleContext> {
        public K ctx;
        public FluxIr<T> ir;

        public File getIrFile() {
            return ir.irFile;
        }
        public FluxBaseVisitor<IrNode<T, ? extends ParserRuleContext>> getGenerator() {
            return ir.generator;
        }
        public boolean getLogIr() {
            return ir.logIr;
        }

        public IrNode(FluxIr<T> ir, K ctx) {
            this.ctx = ctx;
            this.ir = ir;
        }

        public T getNodeToken() {
            return tokenize();
        }

        public List<IrNode<T, K>> children;

        public abstract T getBaseToken();

        public T tokenize() {
            T token = getBaseToken();

            writeIr(token);

            return token;
        }

        @Override
        public String toString() {
            return String.format("<%s%s>", getNodeToken().toString(), children != null ? String.format(" [%s]", children) : "");
        }

        public T visit() {

            return getNodeToken();
        }

        public void visitChildren() {
            if (ctx.children != null) {
                for (var child : ctx.children) {
                    if (!(child instanceof TerminalNodeImpl || child instanceof FluxParser.TerminatorContext)) {
                        if (children == null) {
                            children = new ArrayList<>();
                        }
                        var node = ir.generator.visit(child);

                        if (node != null) {
                            if (!(node instanceof EmptyIrNode)) {
                                node.visit();
                                children.add((FluxIr.IrNode<T, K>) node);
                            }
                        } else {
                            throw new FluxIr.UnimplementedIrNodeException(String.format("Could not construct node from %s, not implemented.", child.getClass().getSimpleName()));
                        }
                    }
                }
            }
        }

        public void writeIr(T token) {
            if (getIrFile() != null && getLogIr()) {
                ir.irString.append(token).append(" ");

                try {
                    Files.writeString(getIrFile().toPath(), ir.irString);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class UnimplementedIrNodeException extends RuntimeException {
        public UnimplementedIrNodeException() {
            super();
        }

        public UnimplementedIrNodeException(String message) {
            super(message);
        }

        public UnimplementedIrNodeException(String message, Throwable cause) {
            super(message, cause);
        }

        public UnimplementedIrNodeException(Throwable cause) {
            super(cause);
        }

        protected UnimplementedIrNodeException(String message, Throwable cause,
                                               boolean enableSuppression,
                                               boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
