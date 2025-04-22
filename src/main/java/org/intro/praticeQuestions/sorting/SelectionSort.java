package org.intro.praticeQuestions.sorting;

public class SelectionSort extends AbstractSort {
    public static void sort(Comparable[] items) {
        int N = items.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (less(items[j], items[min])) {
                    min = j;
                }
            }
            exch(items, min, i);
        }
    }
}
