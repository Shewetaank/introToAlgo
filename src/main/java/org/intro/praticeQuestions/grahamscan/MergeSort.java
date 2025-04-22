package org.intro.praticeQuestions.grahamscan;

import java.util.Comparator;

public class MergeSort {

    public static void sort(Object[] a, Comparator comparator) {
        sort(a, comparator, 0, a.length - 1);
    }

    private static void sort(Object[] a, Comparator comparator, int lo, int hi) {
        Object[] aux = new Object[a.length];
        sort(a, aux, comparator, lo, hi);
    }

    private static void sort(Object[] a, Object[] aux, Comparator comparator, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = (hi - lo)/2 + lo;
        sort(a, aux, comparator, lo, mid);
        sort(a, aux, comparator, mid+1, hi);
        if (!less(comparator, a[mid+1], a[mid])) {
            return;
        }
        merge(a, aux, comparator, lo, mid, hi);
    }

    private static void merge(Object[] a, Object[] aux, Comparator comparator, int lo, int mid, int hi) {
        assert isSorted(a, comparator, lo, mid);
        assert isSorted(a, comparator, mid+1, hi);

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid+1;

        for (int k = lo; k <= hi; k++) {
            if (j > hi) {
                a[k] = aux[i++];
            } else if (i > mid) {
                a[k] = aux[j++];
            } else if (less(comparator, aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }

        assert isSorted(a, comparator, lo, hi);
    }

    private static boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            if (less(comparator, a[i+1], a[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparator comparator, Object a, Object b) {
        return comparator.compare(a, b) < 0;
    }
}
