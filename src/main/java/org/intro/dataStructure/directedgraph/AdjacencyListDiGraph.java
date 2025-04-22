package org.intro.dataStructure.directedgraph;

import org.intro.dataStructure.datatypes.Bag;

public class AdjacencyListDiGraph implements DiGraph {

    private int v;
    protected int e;
    protected final Bag<Integer>[] adj;

    public AdjacencyListDiGraph(int v) {
        this.v = v;
        adj = (Bag<Integer>[]) new Bag[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Bag<>();
        }
    }
    @Override
    public void addEdge(int v, int w) {
        adj[v].add(w);
        this.e++;
    }

    @Override
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    @Override
    public int V() {
        return this.v;
    }

    @Override
    public int E() {
        return this.e;
    }
}
