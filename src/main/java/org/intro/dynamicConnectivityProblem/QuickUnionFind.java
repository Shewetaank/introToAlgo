package org.intro.dynamicConnectivityProblem;

/**
 * QuickUnionFind implements the Union-Find data structure for solving the dynamic connectivity problem.
 * It maintains a collection of elements and provides operations to connect elements and check their connectivity.
 * The implementation uses an array where each element's value represents its connected component.
 * The union operation connects two elements by making one element's id equal to the id of the other's.
 * The connected operation checks if two elements are in the same component by comparing their ids.
 */
public class QuickUnionFind {

    private final int[] id;

    public QuickUnionFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == qid) {
                id[i] = pid;
            }
        }
    }
}
