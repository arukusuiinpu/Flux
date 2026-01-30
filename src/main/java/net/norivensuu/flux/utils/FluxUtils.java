package net.norivensuu.flux.utils;

import org.antlr.v4.runtime.tree.ParseTree;

public class FluxUtils {
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
