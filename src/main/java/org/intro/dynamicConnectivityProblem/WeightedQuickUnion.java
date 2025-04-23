package org.intro.dynamicConnectivityProblem;

/**
 * WeightedQuickUnion is an efficient implementation of the Union-Find data structure that uses weighted union.
 * It maintains two arrays: one for parent pointers and another for tree sizes.
 * The weighted union ensures that smaller trees are always attached to larger ones,
 * keeping the tree height logarithmic.
 */
public class WeightedQuickUnion {

    private final int[] id;
    private final int[] sz;

    /**
     * Initializes the Union-Find data structure with N elements.
     * Each element starts as its own component.
     *
     * @param N the number of elements
     */
    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    /**
     * Finds the root of the tree containing element p.
     *
     * @param a the element to find the root of
     * @return the root element of the tree containing p
     */
    private int root(int a) {
        while (id[a] != a) {
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
     * Makes the root of p's tree point to the root of q's tree.
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
