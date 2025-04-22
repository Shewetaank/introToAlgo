package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.ShellSort;
import org.junit.Test;

public class ShellSortTest {

    @Test
    public void testShellSort() {
        Comparable[] items = {
                2, 6, 7, 3, 12, 9, 8, 4, 6, 20, 10, 24, 11, 23
        };

        ShellSort.sort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
