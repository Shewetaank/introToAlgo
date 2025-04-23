package org.intro.dynamicConnectivityProblem;

/**
 * An optimized implementation of the Union-Find data structure that uses both path compression
 * and weighted union to achieve near-constant time operations. This implementation maintains
 * a forest of trees where each tree represents a connected component. Path compression
 * flattens the tree structure during find operations, while weighted union ensures
 * smaller trees are always attached to larger ones to maintain balance.
 */
public class PathCompressionWeightedQuickUnion {
    private final int[] id;
    private final int[] sz;

    /**
     * Initializes the Union-Find data structure with N elements.
     * Each element starts as its own component.
     *
     * @param N the number of elements
     */
    public PathCompressionWeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    /**
     * Finds the root of the tree containing element a.
     * Implements path compression by making the object point to its grandparent in the tree.
     *
     * @param a the element to find the root of
     * @return the root element of the tree containing a
     */
    private int root(int a) {
        while (id[a] != a) {
            id[a] = id[id[a]]; // make the object point to its grandparent in the tree to reduce the tree height
            a = id[a];
        }
        return a;
    }

    /**
     * Checks if two elements are in the same component.
     *
     * @param p the first element
     * @param q the second element
     * @return true if p and q are in the same component, false otherwise
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * Connects two elements by merging their components.
     *
     * @param p the first element
     * @param q the second element
     */
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
