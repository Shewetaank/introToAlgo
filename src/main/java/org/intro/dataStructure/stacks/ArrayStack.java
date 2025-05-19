package org.intro.dataStructure.stacks;

import java.util.Iterator;

public class ArrayStack<T> implements Stack<T> {

    private T[] stack;
    private int N = 0;

    public ArrayStack() {
        stack = (T[]) new Object[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T value) {
        if (N == stack.length) {
            resize(stack.length * 2);
        }
        stack[N++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T item = stack[--N];
        stack[N] = null;
        if (N <= stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    private void resize(int capacity) {
        T[] temp = (T[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<T> {
        int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return stack[--i];
        }
    }
}
