package org.intro.dataStructure.queue;

public interface Queue<T> {

    void enqueue(T value);

    T dequeue();

    boolean isEmpty();

    int size();
}
