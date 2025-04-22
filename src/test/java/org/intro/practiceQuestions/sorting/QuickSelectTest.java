package org.intro.practiceQuestions.sorting;

import org.intro.praticeQuestions.sorting.QuickSelect;
import org.junit.Test;

public class QuickSelectTest {

    @Test
    public void quickSelectTest() {
        Comparable[] a = {
                3, 5, 2, 8, 6, 10, 7, 8, 12, 9, 0, 12, 9, 45, 23, 19, 10
        };
        int k = 3;
        Comparable item = QuickSelect.select(a, a.length - k);
        System.out.println(item);
    }
}
