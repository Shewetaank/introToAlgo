package org.intro.dataStructure.directedgraph;

import java.util.*;

public class TopologicalSort {

    private Stack<Integer> stk;
    private boolean[] marked;

    public TopologicalSort(AdjacencyListDiGraph graph) {
        this.stk = new Stack<>();
        this.marked = new boolean[graph.V()];

        for (int v = 0; v < graph.V(); v++) {
            if (!this.marked[v]) {
                dfs(graph, v);
            }
        }
    }

    private void dfs(AdjacencyListDiGraph graph, int v) {
        this.marked[v] = true;
        for (int w : graph.adj(v)) {
            if (!this.marked[w]) {
                dfs(graph, w);
            }
        }
        this.stk.push(v);
    }

    public Iterable<Integer> reverseOrder() {
        return this.stk;
    }
}
