package org.intro.dataStructure;

public class UnorderedMaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    public UnorderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key key) {
        pq[N++] = key;
    }

    public Key delMax() {
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (less(max, i)) {
                max = i;
            }
        }
        exch(max, N - 1);
        return pq[--N];
    }

    private boolean less(int a, int b) {
        if (pq[a].compareTo(pq[b]) < 0) {
            return true;
        } else {
            return false;
        }
    }

    private void exch(int max, int i) {
        var swap = pq[i];
        pq[i] = pq[max];
        pq[max] = swap;
    }
}
