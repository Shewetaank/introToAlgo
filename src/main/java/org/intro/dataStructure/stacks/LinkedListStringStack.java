package org.intro.dataStructure.stacks;

public class LinkedListStringStack implements Stack<String> {

    private Node first = null;

    private static class Node {
        String value;
        Node next;
    }

    public LinkedListStringStack() {
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String value) {
        Node oldFirst = first;
        first = new Node();
        first.value = value;
        first.next = oldFirst;
    }

    public String pop() {
        Node item = first;
        first = first.next;
        return item.value;
    }
}
