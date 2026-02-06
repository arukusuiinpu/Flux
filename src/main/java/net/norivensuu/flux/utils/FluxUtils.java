package net.norivensuu.flux.utils;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Objects;
import java.util.stream.Stream;

public class FluxUtils {
    @SafeVarargs
    public static <T> void Print(T... out) {
        String string = CombineString(out);
        if (!string.isEmpty())
            System.out.println(string);
    }

    @SafeVarargs
    public static <T> String CombineString(T... out) {
        StringBuilder builder = new StringBuilder();
        for (var o : out) {
            if (o != null) {
                if (o instanceof ParseTree parseTree) {
                    builder.append(parseTree.getText()).append(" ");
                }
                else builder.append(o).append(" ");
            }
        }
        return builder.toString().stripTrailing();
    }

    @SafeVarargs
    public static  <T> T firstNonNull(T... objects) {
        return Stream.of(objects)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }
}
