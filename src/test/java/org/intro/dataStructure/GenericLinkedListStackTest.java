package org.intro.dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenericLinkedListStackTest {

    @Test
    public void testGenericLinkedListStringStack() {
        var stack = new GenericLinkedListStack<Integer>();
        //assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (int i = 5; i > 0; i--) {
            assertEquals(i, stack.pop().intValue());
        }
    }
}
