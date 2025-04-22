package org.intro.dataStructure;

public class OrderedMaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    public OrderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key key) {
        for (int i = 0; i < N; i++) {
            if (!less(pq[i], key)) {
                Key temp = pq[i];
                pq[i] = key;
                key = temp;
            }
        }
        pq[N++] = key;
    }

    public Key delMax() {
        return pq[--N];
    }

    private boolean less(Key a, Key b) {
        if (a.compareTo(b) < 0) {
            return true;
        } else {
            return false;
        }
    }
}
