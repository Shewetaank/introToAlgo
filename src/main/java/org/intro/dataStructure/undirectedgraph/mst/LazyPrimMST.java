package org.intro.dataStructure.undirectedgraph.mst;

import org.intro.dataStructure.datatypes.Queue;

import java.util.Iterator;

public class LazyPrimMST {

    private final boolean[] marked;
    private final MinPQ<Edge> pq;
    private final Queue<Edge> mst;

    public LazyPrimMST(EdgeWeightedGraph graph) {
        marked = new boolean[graph.vertices()];
        pq = new MinPQ<>();
        mst = new Queue<>();

        visit(graph, 0);

        while (!pq.isEmpty()) {
            Edge e = pq.delMin();
            int v = e.either(), w = e.other(v);
            if (marked[v] && marked[w]) continue;
            mst.enqueue(e);
            if (!marked[v]) visit(graph, v);
            if (!marked[w]) visit(graph, w);
        }
    }

    private void visit(EdgeWeightedGraph graph, int vertex) {
        marked[vertex] = true;
        for (Edge e: graph.adj(vertex)) {
            pq.add(e);
        }
    }

    public Iterator<Edge> mst() {
        return mst.iterator();
    }
}
