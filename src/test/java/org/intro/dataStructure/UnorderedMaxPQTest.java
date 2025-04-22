package org.intro.dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnorderedMaxPQTest {

    @Test
    public void testStack() {
        var pq = new UnorderedMaxPQ<Integer>(10);
        assertTrue(pq.isEmpty());
        pq.insert(10);
        pq.insert(3);
        pq.insert(6);
        pq.insert(9);
        pq.insert(12);
        pq.insert(0);
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        pq.insert(89);
        pq.insert(14);
        System.out.println(pq.delMax());
    }
}
