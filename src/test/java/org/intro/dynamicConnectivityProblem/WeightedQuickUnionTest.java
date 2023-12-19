package org.intro.dynamicConnectivityProblem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WeightedQuickUnionTest {

    @Test
    public void testWeightedUnion() {
        var quickUnion = new WeightedQuickUnion(10);
        quickUnion.union(0, 1);
        quickUnion.union(1, 2);
        quickUnion.union(4, 5);
        quickUnion.union(5, 6);
        quickUnion.union(4, 3);
        quickUnion.union(7, 8);
        quickUnion.union(8, 9);
        quickUnion.union(2, 8);
        assertTrue(quickUnion.connected(0, 8));
        assertFalse(quickUnion.connected(5, 9));
    }
}
