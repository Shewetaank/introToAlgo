package org.intro.dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryHeapPQTest {

    @Test
    public void testStack() {
        var pq = new BinaryHeapPQ<Integer>(20);
        assertTrue(pq.isEmpty());
        pq.insert(10);
        pq.insert(3);
        pq.insert(6);
        pq.insert(9);
        pq.insert(12);
        pq.insert(0);
        pq.insert(34);
        pq.insert(14);
        pq.insert(87);
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        pq.insert(89);
        pq.insert(14);
        pq.insert(78);
        System.out.println(pq.delMax());
    }
}
