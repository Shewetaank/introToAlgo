package org.intro.dataStructure.undirectedgraph.mst;

import org.intro.dataStructure.datatypes.Bag;

import java.util.ArrayList;
import java.util.List;

public class EdgeWeightedGraph {

    private final int V;
    private final Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.adj = (Bag<Edge>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            this.adj[i] = new Bag<>();
        }
    }

    public int vertices() {
        return this.V;
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        this.adj[v].add(e);
        this.adj[w].add(e);
    }

    public Iterable<Edge> adj(int v) {
        return this.adj[v];
    }

    public List<Edge> edges() {
        List<Edge> edges = new ArrayList<>();
        for (var x : this.adj) {
            for (Edge e : x) {
                if (!edges.contains(e)) {
                    edges.add(e);
                }
            }
        }
        return edges;
    }
}
