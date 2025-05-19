package org.intro.praticeQuestions.sorting;

public class MergeSort extends AbstractSort {

    private static final int CUTOFF = 4;

    public void sort(Comparable[] a, int lo, int hi) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, lo, hi);
    }

    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo + CUTOFF - 1) {
            InsertionSort.sort(a, lo, hi);
            return;
        }

        int mid = (hi - lo)/2 + lo;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);

        if (!less(a[mid+1], a[mid])) {
            return;
        }

        merge(a, aux, lo, mid, hi);
    }

    public void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }

        assert isSorted(a, lo, hi);
    }
}
