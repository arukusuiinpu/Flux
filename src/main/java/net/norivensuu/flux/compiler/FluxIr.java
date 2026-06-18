package net.norivensuu.flux.compiler;

import net.norivensuu.flux.antlr.FluxBaseVisitor;
import net.norivensuu.flux.antlr.FluxParser;
import net.norivensuu.flux.ir.EmptyIrNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static net.norivensuu.flux.utils.FluxUtils.*;

public class FluxIr<V> {
    public File irFile;
    public StringBuilder irString = new StringBuilder();
    public boolean logIr = false;

    public FluxBaseVisitor<IrNode<V>> generator;

    public interface IrVisitor<T> {
        void setIr(FluxIr<?> ir);
        FluxIr<T> getIr();
    }

    public FluxIr(FluxBaseVisitor<IrNode<V>> generator) {
        if (generator instanceof IrVisitor<?> irVisitor) {
            irVisitor.setIr(this);
        }
        this.irFile = null;
        this.generator = generator;
    }

    public FluxIr(FluxBaseVisitor<IrNode<V>> generator, File irFile) {
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

    public <T> T visit(IrNode<T> node) {
        return node.visit();
    }

    public IrNode<V> of(ParserRuleContext ctx, Function<IrNode<V>, V> tokenize) {
        return new IrNode<>(this, ctx) {
            @Override
            public V tokenize() {
                V token = tokenize.apply(this);

                if (getIrFile() != null && getLogIr()) {
                    ir.irString.append(token).append(" ");

                    try {
                        Files.writeString(getIrFile().toPath(), ir.irString);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (ctx.children != null) {
                    for (var child : ctx.children) {
                        if (!(child instanceof TerminalNodeImpl)) {
                            if (children == null) {
                                children = new ArrayList<>();
                            }
                            var node = getGenerator().visit(child);

                            if (node != null) {
                                if (!(node instanceof EmptyIrNode)) {
                                    node.visit();
                                    children.add(node);
                                }
                            } else {
                                throw new UnimplementedIrNodeException(String.format("Could not construct node from %s, not implemented.", child.getClass().getSimpleName()));
                            }
                        }
                    }
                }

                return token;
            }
        };
    }
    public IrNode<V> of(ParserRuleContext ctx, V nodeToken) {
        return of(ctx, (s) -> nodeToken);
    }

    public abstract static class IrNode<T> {
        public ParserRuleContext ctx;
        public FluxIr<T> ir;

        public File getIrFile() {
            return ir.irFile;
        }
        public FluxBaseVisitor<IrNode<T>> getGenerator() {
            return ir.generator;
        }
        public boolean getLogIr() {
            return ir.logIr;
        }

        public IrNode(FluxIr<T> ir, ParserRuleContext ctx) {
            this.ctx = ctx;
            this.ir = ir;
        }

        public T getNodeToken() {
            return tokenize();
        }

        public List<IrNode<T>> children;

        public abstract T tokenize();

        @Override
        public String toString() {
            return String.format("<%s%s>", getNodeToken().toString(), children != null ? String.format(" [%s]", children) : "");
        }

        public T visit() {

            return getNodeToken();
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
