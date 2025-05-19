package org.intro.praticeQuestions.shuffling;

import java.util.Random;

/**
 * - iterate over the array, with increment of i, pick a random number from 0 to i.
 * - swap a[i] & a[r]
 */
public class KnuthShuffling {

    public static void shuffle(Comparable[] items) {
        var random = new Random();
        for (int i = 1; i < items.length; i++) {
            int r = random.nextInt(0, i);
            swap(items, i, r);
        }
    }

    private static void swap(Comparable[] items, int i, int r) {
        var swap = items[r];
        items[r] = items[i];
        items[i] = swap;
    }
}
