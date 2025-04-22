package org.intro.dataStructure;

public class ArrayStringStack {

    private final String[] stack;
    private int N;

    public ArrayStringStack(int capacity) {
        N = capacity;
        stack = new String[N];
    }

    public void push(String item) {
        stack[N++] = item;
    }

    public String pop() {
        String item = stack[--N];
        stack[N] = null;
        return item;
    }
}
