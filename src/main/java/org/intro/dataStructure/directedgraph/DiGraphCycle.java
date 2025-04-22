package org.intro.dataStructure.directedgraph;

import java.util.Stack;

public class DiGraphCycle {

    private boolean[] marked;
    private Stack<Integer> cycle;
    private int[] edgeTo;

    public DiGraphCycle(AdjacencyListDiGraph graph) {
        // Check if there are parallel edges
        if (hasParallelEdges(graph)) {
            return;
        }

        // Check if there are self loops
        if (hasSelfLoop(graph)) {
            return;
        }

        // check for the cycle in the graph
        this.marked = new boolean[graph.V()];
        this.edgeTo = new int[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            dfs(graph, -1, v);
        }
    }

    public boolean hasCycle() {
        return cycle != null;
    }

    public Iterable<Integer> cycle() {
        return cycle;
    }

    private boolean hasSelfLoop(AdjacencyListDiGraph graph) {
        for (int v = 0; v < graph.V(); v++) {
            for (int w : graph.adj(v)) {
                if (v == w) {
                    this.cycle = new Stack<>();
                    this.cycle.push(v);
                    this.cycle.push(v);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasParallelEdges(AdjacencyListDiGraph graph) {
        this.marked = new boolean[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            for (int w : graph.adj(v)) {
                if (this.marked[w]) {
                    this.cycle = new Stack<>();
                    this.cycle.push(v);
                    this.cycle.push(w);
                    this.cycle.push(v);
                    return true;
                }
                this.marked[w] = true;
            }

            for (int w : graph.adj(v)) {
                this.marked[w] = false;
            }
        }
        return false;
    }

    private void dfs(AdjacencyListDiGraph graph, int u, int v) {
        this.marked[v] = true;
        for (int w : graph.adj(v)) {
            if (this.cycle != null) {
                return;
            }

            if (!this.marked[w]) {
                this.edgeTo[w] = v;
                dfs(graph, v, w);
            } else if (u != w) {
                this.cycle = new Stack<>();
                for (int i = v; i != w; i = this.edgeTo[i]) {
                    this.cycle.push(i);
                }
                this.cycle.push(w);
                this.cycle.push(v);
            }
        }
    }
}
