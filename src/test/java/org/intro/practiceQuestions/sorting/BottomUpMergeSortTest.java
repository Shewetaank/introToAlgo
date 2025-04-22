package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.BottomUpMergeSort;
import org.junit.Test;

public class BottomUpMergeSortTest {

    @Test
    public void mergeSort() {
        Comparable[] a = {
                3, 5, 2, 8, 6, 10, 7, 8, 12, 9, 0, 23, 12, 9, 45, 23, 19, 10
        };
        BottomUpMergeSort.sort(a);
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }
}
