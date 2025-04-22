package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.HeapSort;
import org.intro.praticeQuestions.sorting.MergeSort;
import org.junit.Test;

import java.util.Random;

public class HeapSortTest {

    @Test
    public void heapSort() {
        Comparable[] a = {
                9, 4, 2, 5, 6, 1, 10, 8, 5
        };
        HeapSort.sort(a);
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }
}
