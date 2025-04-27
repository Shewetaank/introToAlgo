package org.intro.dataStructure.queue;

public class LinkedListStringQueue implements Queue<String> {

    private Node first, last;
    private int size = 0;

    private static class Node {
        String value;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        var oldFirst = first;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        size--;
        return oldFirst.value;
    }

    public void enqueue(String value) {
        var oldLast = last;
        last = new Node();
        last.value = value;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    public String head() {
        return first.value;
    }

    public String tail() {
        return last.value;
    }
}
