package org.intro.dataStructure.undirectedgraph.mst;

import java.util.ArrayList;
import java.util.List;

public class MinPQ<T> {

    List<T> queue = new ArrayList<>();

    public MinPQ() {

    }

    public void add(T t) {
        queue.add(t);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T delMin() {
        return queue.get(0);
    }
}
