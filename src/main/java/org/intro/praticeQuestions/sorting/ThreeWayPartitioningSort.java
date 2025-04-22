package org.intro.praticeQuestions.sorting;

public class ThreeWayPartitioningSort extends AbstractSort {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int lt = lo, gt = hi;
        Comparable compare = a[lo];
        int i = lo;
        while (i <= gt) {
            int cmp = a[i].compareTo(compare);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
}
