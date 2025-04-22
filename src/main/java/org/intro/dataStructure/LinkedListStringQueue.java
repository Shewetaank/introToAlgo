package org.intro.dataStructure;

public class LinkedListStringQueue {

    private Node first, last;

    private static class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String dequeue() {
        var oldFirst = first;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return oldFirst.item;
    }

    public void enqueue(String value) {
        Node oldLast = last;
        last = new Node();
        last.item = value;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public String head() {
        return first.item;
    }

    public String tail() {
        return last.item;
    }
}
