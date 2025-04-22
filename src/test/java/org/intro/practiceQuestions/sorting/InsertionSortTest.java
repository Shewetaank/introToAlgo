package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.InsertionSort;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testSort() {
        Comparable[] items = {
                3, 6, 2, 9, 8, 7, 12, 10, 20, 6
        };
        InsertionSort.sort(items);
        for (Comparable item : items) {
            System.out.print(item + " ");
        }
    }
}
