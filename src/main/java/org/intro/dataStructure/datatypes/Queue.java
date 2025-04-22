package org.intro.dataStructure.datatypes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> {

    private Node<Item> first;
    private int size = 0;

    static class Node<Item> {
        private Node<Item> next;
        private final Item value;

        public Node(Item v) {
            this.value = v;
        }

        public Node<Item> next() {
            return this.next;
        }
    }

    public void enqueue(Item v) {
        var node = new Node<>(v);
        node.next = first;
        first = node;
        size++;
    }

    public Item dequeue() {
        var oldFirst = first;
        first = first.next();
        size--;
        return oldFirst.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.value;
            current = current.next;
            return item;
        }
    }
}
