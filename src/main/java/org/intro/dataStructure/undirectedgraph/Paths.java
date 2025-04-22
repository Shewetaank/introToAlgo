package org.intro.dataStructure.undirectedgraph;

public class Paths {

    private final AdjacencyListGraph graph;
    private final int source;

    public Paths(AdjacencyListGraph graph, int source) {
        this.graph = graph;
        this.source = source;
    }

    public boolean hasPathTo(int v) {
        return false;
    }

    public Iterable<Integer> pathTo(int v) {
        return null;
    }
}
