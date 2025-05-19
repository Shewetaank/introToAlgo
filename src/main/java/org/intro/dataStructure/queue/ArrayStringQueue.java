package org.intro.dataStructure.queue;

public class ArrayStringQueue implements Queue<String> {

    private String[] queue;
    private int first, last;

    public ArrayStringQueue() {
        queue = new String[1];
    }

    @Override
    public void enqueue(String value) {
        if (last - first + 1 == queue.length) {
            resize(queue.length * 2);
        }
        queue[last++] = value;
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        var oldFirst = queue[first];
        queue[first] = null;
        if (first < last) {
            first = first + 1;
        }
        if (last - first + 1 == queue.length/4) {
            resize(queue.length/2);
        }
        return oldFirst;
    }

    @Override
    public boolean isEmpty() {
        return queue[first] == null;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return last - first + 1;
        }
    }

    private void resize(int capacity) {
        var temp = new String[capacity];
        for (int i = 0; i < queue.length; i++) {
            temp[i] = queue[i];
        }
        queue = temp;
    }
}
