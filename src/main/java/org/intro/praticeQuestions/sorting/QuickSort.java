package org.intro.praticeQuestions.sorting;

import static org.intro.praticeQuestions.shuffling.KnuthShuffling.shuffle;

/**
 * Properties of quick sort-
 * 1. Quick sort is not stable.
 */
public class QuickSort extends AbstractSort {

    public static void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        /**
         * For smaller sub-arrays quick sort can take more time, so better to use insertion sort
         * when the sub-array is < 20.
         */
        int CUTOFF = 1;
        if (hi <= lo + CUTOFF - 1) {
            //InsertionSort.sort(a);
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
