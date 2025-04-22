package org.intro.dataStructure.directedgraph.shortestpath;

public class DijksrtaSP {
    /*
    private DirectedEdge[] edgeTo;
    private double[] distTo;
    private IndexMinPQ<Double> pq;

    public DijksrtaSP(EdgeWeightedDirectedGraph graph, int source) {
        edgeTo = new DirectedEdge[graph.V()];
        distTo = new double[graph.V()];
        pq = new IndexMinPQ<Double>();

        for (int i = 0; i < graph.V(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[source] = 0.0;

        pq.insert(source, 0.0);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            for (DirectedEdge e: graph.adj(v)) {
                relax(e);
            }
        }
    }

    private void relax(DirectedEdge e) {
        int v = e.from(), w = e.to();
        if (distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
            if (pq.contains(w)) {
                pq.decreaseKey(w, distTo[w]);
            } else {
                pq.insert(w, distTo[w]);
            }
        }
    }

     */
}
