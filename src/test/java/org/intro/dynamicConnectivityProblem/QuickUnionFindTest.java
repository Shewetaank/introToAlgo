package org.intro.dynamicConnectivityProblem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickUnionFindTest {

    @Test
    public void testQuickFind() {
        var quickFind = new QuickUnionFind(10);
        quickFind.union(0, 1);
        quickFind.union(6, 7);
        quickFind.union(1, 7);
        quickFind.union(2, 8);
        quickFind.union(3, 9);
        quickFind.union(8, 9);
        quickFind.union(4, 5);
        assertTrue(quickFind.connected(0, 7));
        assertFalse(quickFind.connected(7, 5));
        assertFalse(quickFind.connected(0, 5));
    }
}
