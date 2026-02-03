package net.norivensuu.flux.asm;

import net.norivensuu.flux.structure.FluxNode;

import java.util.*;

import static net.norivensuu.flux.utils.FluxUtils.*;

public class ASMFluxIR {
    public HashMap<FluxNode<?>, LinkedHashSet<FluxNode<?>>> tree = new LinkedHashMap<>();

    public HashMap<Class<? extends FluxNode<?>>, ArrayList<Integer>> typeMap = new LinkedHashMap<>();

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
            typeMap.put((Class<? extends FluxNode<?>>) node.getClass(), new ArrayList<>(){{ add(discoveryOrder); }});
        }
        else {
            var list = typeMap.get(node.getClass());
            list.add(discoveryOrder);
            typeMap.put((Class<? extends FluxNode<?>>) node.getClass(), list);
        }
        node.discoveryOrder = typeMap.get(node.getClass()).size()-1;

        discoveryOrder++;
    }
}
