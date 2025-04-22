package org.intro.praticeQuestions.sorting;

public class HeapSort {

    public static void sort(Comparable[] items) {
        int N = items.length;
        for (int k = N/2; k >= 1; k--) {
            sink(items, k, N);
        }
        while (N > 1) {
            exch(items, 1, N);
            sink(items, 1, --N);
        }
    }

    private static void sink(Comparable[] items, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(items, j, j+1)) {
                j++;
            }
            if (!less(items, k, j)) {
                break;
            }
            exch(items, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] items, int a, int b) {
        return items[a-1].compareTo(items[b-1]) < 0;
    }

    private static void exch(Comparable[] items, int a, int b) {
        Comparable tmp = items[a-1];
        items[a-1] = items[b-1];
        items[b-1] = tmp;
    }
}
