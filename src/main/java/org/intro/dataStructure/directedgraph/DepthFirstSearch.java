package org.intro.dataStructure.directedgraph;

public class DepthFirstSearch {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int source;

    public DepthFirstSearch(AdjacencyListDiGraph graph, int source) {
        this.marked = new boolean[graph.V()];
        this.edgeTo = new int[graph.V()];
        this.source = source;
        dfs(graph, source);
    }

    private void dfs(AdjacencyListDiGraph graph, int source) {
        this.marked[source] = true;
        for (int w : graph.adj(source)) {
            if (!this.marked[w]) {
                dfs(graph, w);
                this.edgeTo[w] = source;
            }
        }
    }

    public boolean visited(int v) {
        return this.marked[v];
    }
}
