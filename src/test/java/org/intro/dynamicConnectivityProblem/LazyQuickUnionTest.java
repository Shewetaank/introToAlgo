package org.intro.dynamicConnectivityProblem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LazyQuickUnionTest {

    @Test
    public void testLazyQuickUnion() {
        var quickUnion = new LazyQuickUnion(10);
        quickUnion.union(0, 1);
        quickUnion.union(4, 5);
        quickUnion.union(1, 5);
        quickUnion.union(6, 7);
        quickUnion.union(6, 8);
        quickUnion.union(2, 3);
        quickUnion.union(3, 9);
        quickUnion.union(3, 8);
        assertTrue(quickUnion.connected(0, 5));
        assertTrue(quickUnion.connected(7, 3));
        assertFalse(quickUnion.connected(0, 7));
    }
}
