package org.intro.dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListStringQueueTest {

    @Test
    public void testLinkedListQueue() {
        var queue = new LinkedListStringQueue();
        queue.enqueue("to");
        queue.enqueue("be");
        assertEquals(queue.dequeue(), "to");
        queue.enqueue("or");
        queue.enqueue("not");
        queue.enqueue("to");
        queue.enqueue("be");
        assertEquals(queue.dequeue(), "be");
        assertEquals(queue.dequeue(), "or");
        assertEquals(queue.tail(), "be");
    }
}
