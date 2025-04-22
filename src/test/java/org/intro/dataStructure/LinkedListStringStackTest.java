package org.intro.dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListStringStackTest {

    @Test
    public void testStack() {
        var stack = new LinkedListStringStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        // assertEquals(stack., 5);
        for (int i = 1; i <= 5; i++) {
            System.out.print(stack.pop() + " ");
        }
        assertTrue(stack.isEmpty());
    }
}
