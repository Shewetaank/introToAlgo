package org.intro.dataStructure.undirectedgraph;

public class ConnectedComponentDFS {

    private final boolean[] marked;
    private final int[] cc;

    private int count = 0;

    public ConnectedComponentDFS(AdjacencyListGraph graph) {
        this.marked = new boolean[graph.size()];
        this.cc = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (!marked[i]) {
                dfs(graph, i);
                count++;
            }
        }
    }

    public int count() {
        return count + 1;
    }

    public int cc(int v) {
        return cc[v];
    }

    private void dfs(AdjacencyListGraph graph, int v) {
        marked[v] = true;
        cc[v] = count;
        for (int w : graph.adj(v)) {
            if (!marked[w]) {
                dfs(graph, w);
            }
        }
    }
}
