package org.intro.dataStructure.stacks;

import java.util.Iterator;

/**
 * A generic stack implementation using a linked list data structure.
 * This implementation provides constant time operations for push and pop operations.
 * The stack follows LIFO (Last In First Out) principle.
 *
 * @param <T> the type of elements stored in the stack
 */
public class LinkedListStringStack<T> implements Stack<T> {

    /** Reference to the first node in the linked list */
    private Node<T> first = null;

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    /**
     * Node class representing an element in the linked list.
     * Each node contains a value and a reference to the next node.
     *
     * @param <T> the type of element stored in the node
     */
    private static class Node<T> {
        /** The value stored in the node */
        T value;
        /** Reference to the next node in the list */
        Node<T> next;
    }

    /**
     * Constructs an empty stack.
     */
    public LinkedListStringStack() {
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Pushes an element onto the top of the stack.
     * Time complexity: O(1)
     *
     * @param value the element to be pushed onto the stack
     */
    public void push(T value) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.value = value;
        first.next = oldFirst;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * Time complexity: O(1)
     *
     * @return the element at the top of the stack
     * @throws NullPointerException if the stack is empty
     */
    public T pop() {
        Node<T> item = first;
        first = first.next;
        return item.value;
    }

    /**
     * Iterator implementation for the stack.
     * Allows iterating through the elements in the stack from top to bottom.
     */
    private class LinkedListIterator implements Iterator<T> {
        /** Current node being processed */
        Node<T> temp = first;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public T next() {
            Node<T> old = temp;
            temp = temp.next;
            return old.value;
        }
    }
}
