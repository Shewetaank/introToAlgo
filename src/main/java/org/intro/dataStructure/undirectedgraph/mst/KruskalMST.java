package org.intro.dataStructure.undirectedgraph.mst;

import org.intro.dataStructure.datatypes.Queue;
import org.intro.dynamicConnectivityProblem.QuickUnionFind;

import java.util.Iterator;

public class KruskalMST {

    private Queue<Edge> mst = new Queue<>();

    public KruskalMST(EdgeWeightedGraph graph) {
        MinPQ<Edge> pq = new MinPQ<>();
        for (Edge e : graph.edges()) {
            pq.add(e);
        }

        QuickUnionFind uf = new QuickUnionFind(graph.vertices());
        while (!pq.isEmpty() && mst.size() < graph.vertices() - 1) {
            Edge e = pq.delMin();
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                uf.union(v, w);
                mst.enqueue(e);
            }
        }
    }

    public Iterator<Edge> edges() {
        return mst.iterator();
    }
}
