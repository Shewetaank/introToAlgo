package org.intro.dataStructure;

public class GenericLinkedListStack<T> {
    private Node<T> first;

    static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public T pop() {
        var oldFirst = first;
        first = first.next;
        return oldFirst.item;
    }

    public void push(T value) {
        var newFirst = new Node<T>();
        newFirst.item = value;
        newFirst.next = first;
        first = newFirst;
    }
}