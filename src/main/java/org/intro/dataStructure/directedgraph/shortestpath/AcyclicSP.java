package org.intro.dataStructure.directedgraph.shortestpath;

import org.intro.dataStructure.directedgraph.TopologicalSort;

public class AcyclicSP {

    private DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedDirectedGraph graph, int source) {
        edgeTo = new DirectedEdge[graph.V()];
        distTo = new double[graph.V()];

        for (int i = 0; i < graph.V(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[source] = 0.0;

        /*
        TopologicalSort topologicalSort = new TopologicalSort(graph);
        for (int v : topologicalSort.reverseOrder()) {
            for (DirectedEdge e: graph.adj(v)) {
                relax(e);
            }
        }
         */
    }

    private void relax(DirectedEdge e) {
        int v = e.from(), w = e.to();
        if (distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
        }
    }
}
