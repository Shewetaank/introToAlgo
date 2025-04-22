package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.QuickSort;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void mergeSort() {
        Comparable[] a = {
                3, 5, 2, 8, 6, 10, 7, 8, 12, 9, 0, 23, 12, 9, 45, 23, 19, 10
        };
        QuickSort.sort(a);
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }
}
