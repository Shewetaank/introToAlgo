package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.SelectionSort;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        Comparable[] items = {
                2, 6, 7, 3, 12, 9, 8, 4, 6, 20, 10
        };

        SelectionSort.sort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
