package org.intro.dataStructure.directedgraph.shortestpath;

import java.util.Stack;

public class SingleSourceSP {

    private final DirectedEdge[] edgeTo;
    private final double[] distTo;

    public SingleSourceSP(EdgeWeightedDirectedGraph graph, int s) {
        this.edgeTo = new DirectedEdge[graph.V()];
        this.distTo = new double[graph.V()];
    }

    public double distTo(int v) {
        return this.distTo[v];
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        Stack<DirectedEdge> stk = new Stack<>();
        for (DirectedEdge e = this.edgeTo[v]; e != null; e = this.edgeTo[e.from()]) {
            stk.push(e);
        }
        return stk;
    }

    private void relaxEdge(DirectedEdge e) {
        int v = e.from(), w = e.to();
        if (this.distTo[w] > this.distTo[v] + e.weight()) {
            this.distTo[w] = this.distTo[v] + e.weight();
            this.edgeTo[w] = e;
        }
    }
}
