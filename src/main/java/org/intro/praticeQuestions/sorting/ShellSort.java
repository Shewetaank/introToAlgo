package org.intro.praticeQuestions.sorting;

import static org.intro.praticeQuestions.sorting.AbstractSort.exch;
import static org.intro.praticeQuestions.sorting.AbstractSort.less;

public class ShellSort {

    public static void sort(Comparable[] items) {
        int N = items.length;
        int h = 1;
        while (h < N/3) {
            h = 3*h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (less(items[j], items[j-h])) {
                        exch(items, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h = h/3;
        }
    }
}
