package org.intro.practiceQuestions;

import org.intro.praticeQuestions.StackImplOfQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackImplOfQueueTest {

    @Test
    public void testQueue() {
        var queue = new StackImplOfQueue<Integer>();
        assertNull(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue().intValue());
        assertEquals(2, queue.dequeue().intValue());
        queue.enqueue(4);
        assertEquals(3, queue.dequeue().intValue());
        assertEquals(4, queue.dequeue().intValue());
    }
}
