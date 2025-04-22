package org.intro.praticeQuestions;

import org.intro.dataStructure.GenericLinkedListStack;

public class StackImplOfQueue<T> {

    private final GenericLinkedListStack<T> stack1;
    private final GenericLinkedListStack<T> stack2;

    public StackImplOfQueue() {
        stack1 = new GenericLinkedListStack<>();
        stack2 = new GenericLinkedListStack<>();
    }

    public void enqueue(T item) {
        stack1.push(item);
    }

    public T dequeue() {
        /*if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return null;
            }
            // pop all items in stack1 to stack2
            transferToStack2();
        }*/
        return stack2.pop();
    }

    private void transferToStack2() {
        /*while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }*/
    }
}
