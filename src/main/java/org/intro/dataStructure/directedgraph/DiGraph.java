package org.intro.dataStructure.directedgraph;

public interface DiGraph {

    void addEdge(int v, int w);

    Iterable<Integer> adj(int v);

    // number of vertices
    int V();

    // number of edges
    int E();
}
