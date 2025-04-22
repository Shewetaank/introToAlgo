package org.intro.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] id = {0, 12, 19, 23, 30, 38, 42, 55, 64, 70, 82, 91, 99, 101};
        var binarySearch = new BinarySearch(id);
        assertEquals(3, binarySearch.search(23));
        assertEquals(-1, binarySearch.search(85));
    }
}
