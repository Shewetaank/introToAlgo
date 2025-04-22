package org.intro.praticeQuestions.sorting;

abstract class AbstractSort {
    static boolean less(Comparable a, Comparable b) {
        if (a.compareTo(b) < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void exch(Comparable[] items, int i, int min) {
        var swap = items[min];
        items[min] = items[i];
        items[i] = swap;
    }
}
