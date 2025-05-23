package org.intro.dataStructure.undirectedgraph.mst;

public class Edge implements Comparable<Edge> {

    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either() {
        return this.v;
    }

    public int other(int vertex) {
        if (this.v == vertex) {
            return this.w;
        }
        return this.v;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight > other.weight) {
            return +1;
        } else {
            return 0;
        }
    }
}
