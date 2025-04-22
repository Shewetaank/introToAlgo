package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.ThreeWayPartitioningSort;
import org.junit.Test;

public class ThreeWayPartitioningSortTest {

    @Test
    public void mergeSort() {
        Comparable[] a = {
                4, 5, 6, 4, 7, 4, 8, 2, 4, 3, 5, 6, 9, 0, 1, 0
        };
        ThreeWayPartitioningSort.sort(a);
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }
}
