package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.MergeSort;
import org.junit.Test;

import java.util.Random;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        Random r = new Random();
        Comparable [] array = new Comparable[100];
        for (int a = 0; a < array.length; a++) {
            if ((a + 1) % 10 != 0) {
                array[a] = (a + 1) * 10;
            } else {
                array[a] = r.nextInt(1000);
            }
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        for (Comparable comparable : array) {
            System.out.print(comparable + " ");
        }
    }

    @Test
    public void merge() {
        Comparable[] a = {
                0, 1, 4, 6, 7, 8, 9
        };
        MergeSort mergeSort = new MergeSort();
        Comparable[] aux = new Comparable[a.length];
        mergeSort.merge(a, aux, 0, 3, 6);
    }
}
