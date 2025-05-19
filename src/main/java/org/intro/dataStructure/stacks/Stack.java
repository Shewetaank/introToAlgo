package org.intro.dataStructure.stacks;

/**
 * A generic stack interface that defines the basic operations of a stack data structure.
 * A stack is a LIFO (Last In First Out) data structure where elements are added and removed
 * from the same end, called the top of the stack.
 *
 * @param <T> the type of elements stored in the stack
 */
public interface Stack<T> extends Iterable<T> {

    /**
     * Adds an element to the top of the stack.
     *
     * @param value the element to be added to the stack
     */
    void push(T value);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    T pop();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise
     */
    boolean isEmpty();
}
