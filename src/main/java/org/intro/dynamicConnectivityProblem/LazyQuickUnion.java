package org.intro.dynamicConnectivityProblem;

public class LazyQuickUnion {

    private final int[] id;

    public LazyQuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int a) {
        while (id[a] != a) {
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

        id[rootP] = rootQ;
    }
}
