package net.norivensuu.flux.asm;

import net.norivensuu.flux.structure.FluxNode;

import java.util.*;
import java.util.stream.Collectors;

import static net.norivensuu.flux.utils.FluxUtils.*;

public class ASMFluxIR {
    public HashMap<FluxNode<?>, LinkedHashSet<FluxNode<?>>> tree = new LinkedHashMap<>();

    public HashMap<Class<? extends FluxNode<?>>, List<RecordNode>> typeMap = new LinkedHashMap<>();

    public int[] ints = new int[]{};
    public float[] floats = new float[]{};
    public double[] doubles = new double[]{};
    public long[] longs = new long[]{};
    public boolean[] booleans = new boolean[]{};

    public int discoveryOrder;

    @SuppressWarnings("unchecked")
    public void addNode(FluxNode<?> node) {

        var set = new LinkedHashSet<>(node.parents);
        tree.put(node, set);

        if (!typeMap.containsKey(node.getClass())) {
            typeMap.put((Class<? extends FluxNode<?>>) node.getClass(), new ArrayList<>(){{ add(new RecordNode(node.getRecord(), discoveryOrder)); }});
        }
        else {
            var list = typeMap.get(node.getClass());
            list.add(new RecordNode(node.getRecord(), discoveryOrder));
            typeMap.put((Class<? extends FluxNode<?>>) node.getClass(), list);
        }
        node.discoveryOrder = typeMap.get(node.getClass()).size()-1;

        discoveryOrder++;
    }

    public static class RecordNode {
        public int order;
        public Record data;

        public RecordNode(Record data, int order) {
            this.order = order;
            this.data = data;
        }

        @Override
        public String toString() {
            return String.format("%s(%s)", data, order);
        }
    }
}
