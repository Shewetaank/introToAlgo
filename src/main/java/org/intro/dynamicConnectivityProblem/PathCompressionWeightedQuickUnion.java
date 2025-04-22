package org.intro.dynamicConnectivityProblem;

/**
 * Another way to solve quick union is by weighted quick union with path compression
 */
public class PathCompressionWeightedQuickUnion {
    private final int[] id;
    private final int[] sz;

    public PathCompressionWeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int a) {
        while (id[a] != a) {
            id[a] = id[id[a]]; // make the object point to its grand-parent in the tree to reduce the tree height
            a = id[a];
        }
        return a;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (sz[rootP] < sz[rootQ]) {
            id[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        } else {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        }
    }
}
