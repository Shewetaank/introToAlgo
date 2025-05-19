package org.intro.praticeQuestions.sorting;

public class AbstractSort {
    static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    static void exch(Comparable[] items, int i, int min) {
        var swap = items[min];
        items[min] = items[i];
        items[i] = swap;
    }

    static boolean isSorted(Comparable[] items, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            if (less(items[i+1], items[i])) {
                return false;
            }
        }
        return true;
    }
}
