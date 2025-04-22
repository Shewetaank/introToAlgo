package org.intro.dataStructure.directedgraph.shortestpath;

import org.intro.dataStructure.datatypes.Bag;

public class EdgeWeightedDirectedGraph {

    private final int V;
    private Bag<DirectedEdge>[] adj;

    public EdgeWeightedDirectedGraph(int v) {
        this.V = v;
        this.adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int i = 0; i < this.V; i++) {
            this.adj[i] = new Bag<>();
        }
    }

    public void addEdge(DirectedEdge edge) {
        int v = edge.from();
        this.adj[v].add(edge);
    }

    public Iterable<DirectedEdge> adj(int v) {
        return this.adj[v];
    }

    public int V() {
        return this.V;
    }
}
