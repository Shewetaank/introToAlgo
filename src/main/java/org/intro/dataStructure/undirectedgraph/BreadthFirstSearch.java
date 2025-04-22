package org.intro.dataStructure.undirectedgraph;

import org.intro.dataStructure.datatypes.Queue;

import java.util.Stack;

public class BreadthFirstSearch {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final  int source;

    public BreadthFirstSearch(AdjacencyListGraph graph, int source) {
        this.source = source;
        this.marked = new boolean[graph.size()];
        this.edgeTo = new int[graph.size()];
        bfs(graph, source);
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
        stk.push(edgeTo[source]);
        return stk;
    }

    private void bfs(AdjacencyListGraph graph, int source) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(source);
        marked[source] = true;
        while (!queue.isEmpty()) {
            int v = queue.dequeue();

            for (int w : graph.adj(v)) {
                if (!marked[w]) {
                    queue.enqueue(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
