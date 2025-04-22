package org.intro.practiceQuestions.shuffling;

import org.intro.praticeQuestions.shuffling.KnuthShuffling;
import org.junit.Test;

public class KnuthShufflingTest {

    @Test
    public void testShellSort() {
        Comparable[] items = {
                2, 6, 7, 3, 12, 9, 8, 4, 6, 20, 10
        };

        KnuthShuffling.shuffle(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
