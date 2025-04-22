package org.intro.dataStructure.directedgraph;

import org.intro.dataStructure.datatypes.Queue;

public class BreadthFirstSearch {

    private boolean[] marked;
    private int[] edgeTo;
    private int[] dist;

    public BreadthFirstSearch(AdjacencyListDiGraph graph, int source) {
        this.marked = new boolean[graph.V()];
        this.edgeTo = new int[graph.V()];
        this.dist = new int[graph.V()];
        this.dist[source] = 0;
        bfs(graph, source);
    }

    private void bfs(AdjacencyListDiGraph graph, int source) {
        marked[source] = true;
        Queue<Integer> q = new Queue<>();
        q.enqueue(source);
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : graph.adj(v)) {
                if (!marked[w]) {
                    q.enqueue(w);
                    // distance from the source.
                    this.dist[w] = this.dist[source] + 1;
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
