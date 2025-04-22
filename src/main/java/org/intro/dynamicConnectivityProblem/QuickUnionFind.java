package org.intro.dynamicConnectivityProblem;

/**
 * Quick union find class is used to perform 2 operations
 * - union - to connect two objects
 * - connected - to query if two objects are connected
 */
public class QuickUnionFind {

    private final int[] id;

    public QuickUnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
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
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
