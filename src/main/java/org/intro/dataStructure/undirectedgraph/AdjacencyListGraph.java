package org.intro.dataStructure.undirectedgraph;

import org.intro.dataStructure.datatypes.Bag;

public class AdjacencyListGraph {

    private final int V;
    private Bag<Integer>[] adj;

    public AdjacencyListGraph(int V) {
        this.V = V;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            this.adj[i] = new Bag<>();
        }
    }

    public void addEdge(int v, int w) {
        this.adj[v].add(w);
        this.adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return this.adj[v];
    }

    public int degree(int v) {
        return this.adj[v].size();
    }

    public int maxDegree() {
        int max = 0;
        for (int i = 0; i < this.V; i++) {
            max = Math.max(max, this.degree(i));
        }
        return max;
    }

    public int size() {
        return this.V;
    }
}
