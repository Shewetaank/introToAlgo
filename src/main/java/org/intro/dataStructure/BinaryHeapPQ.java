package org.intro.dataStructure;

public class BinaryHeapPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public BinaryHeapPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity+1];
    }

    // public operations
    // insert
    public void insert(Key item) {
        pq[++N] = item;
        swim(N);
    }
    // delMax
    public Key delMax() {
        Key res = pq[1];
        exch(1, N--);
        sink(1);
        pq[N+1] = null;
        return res;
    }
    // isEmpty
    public boolean isEmpty() {
        return N == 0;
    }

    // private operations
    // less
    private boolean less(int a, int b) {
        return pq[a].compareTo(pq[b]) < 0;
    }
    // exch
    private void exch(int a, int b) {
        Key tmp = pq[a];
        pq[a] = pq[b];
        pq[b] = tmp;
    }
    // swim
    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }
    // sink
    private void sink(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(j, j+1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }
}
