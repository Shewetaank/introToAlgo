package org.intro.dataStructure;

public class ArrayStack {

    private String[] stack;
    private int N = 0;

    public ArrayStack(int capacity) {
        stack = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String value) {
        if (N == stack.length) {
            resize(stack.length * 2);
        }
        stack[N++] = value;
    }

    public String pop() {
        String item = stack[--N];
        stack[N] = null;
        if (N <= stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    private void resize(int capacity) {
        String[] temp = new String[capacity];
        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }
}
