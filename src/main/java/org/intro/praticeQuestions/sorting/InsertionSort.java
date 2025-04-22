package org.intro.praticeQuestions.sorting;

public class InsertionSort extends AbstractSort {

    public static void sort(Comparable[] items) {
        int N = items.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(items[j], items[j-1])) {
                    exch(items, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
