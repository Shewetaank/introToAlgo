package org.intro.dynamicConnectivityProblem;

/**
 * An optimized implementation of the Union-Find data structure that combines
 * weighted quick union with path compression. This implementation provides
 * near-constant time complexity for union and find operations.
 * 
 * Key features:
 * - Weighted union to keep trees balanced
 * - Path compression to flatten the tree structure
 * - O(log* N) time complexity for operations
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
            id[a] = id[id[a]]; // make the object point to its grandparent in the tree to reduce the tree height
            a = id[a];
        }
        return a;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if (pid == qid) {
            return;
        }
        if (sz[pid] < sz[qid]) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        } else {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
    }
}
