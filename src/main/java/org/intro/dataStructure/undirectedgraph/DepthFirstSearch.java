package org.intro.dataStructure.undirectedgraph;

import java.util.Stack;

public class DepthFirstSearch {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int source;

    public DepthFirstSearch(AdjacencyListGraph graph, int source) {
        this.marked = new boolean[graph.size()];
        this.edgeTo = new int[graph.size()];
        this.source = source;
        dfs(graph, source);
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Stack<Integer> pathTo(int v) {
        if (!marked[v]) {
            return null;
        }
        Stack<Integer> stk = new Stack<>();
        for (int i = v; i != source; i = edgeTo[i]) {
            stk.push(edgeTo[i]);
        }
        stk.push(source);
        return stk;
    }

    private void dfs(AdjacencyListGraph graph, int source) {
        marked[source] = true;
        for (int w : graph.adj(source)) {
            if (!marked[w]) {
                dfs(graph, w);
                edgeTo[w] = source;
            }
        }
    }
}
