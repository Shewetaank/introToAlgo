package org.intro.dynamicConnectivityProblem;

/**
 * LazyQuickUnion is an implementation of the Union-Find data structure that uses
 * lazy approach for union operations. It maintains a forest of trees where each
 * node points to its parent, and the root of each tree represents the component.
 * This implementation provides efficient union and find operations for dynamic
 * connectivity problems.
 */
public class LazyQuickUnion {

    private final int[] id;

    /**
     * Initializes the Union-Find data structure with N elements.
     * Each element starts as its own component.
     *
     * @param N the number of elements
     */
    public LazyQuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Finds the root of the tree containing element p.
     * Implements path compression by following parent pointers until reaching the root.
     *
     * @param p the element to find the root of
     * @return the root element of the tree containing p
     */
    private int root(int p) {
        while (id[p] != p) {
            p = id[p];
        }
        return p;
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

        id[pid] = qid;
    }
}
