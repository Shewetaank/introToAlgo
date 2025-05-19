package org.intro.praticeQuestions.sorting;

import static org.intro.praticeQuestions.shuffling.KnuthShuffling.shuffle;

/**
 * The QuickSelection class provides an implementation of the QuickSelect algorithm for finding the k-th smallest element in an array.
 * <p>
 * This class extends QuickSort to reuse the partitioning logic. It uses the Knuth shuffle to randomize the input array
 * before selection, ensuring good average-case performance. The select method finds the element that would be at index k
 * if the array were sorted, but does so in linear time on average without fully sorting the array.
 * </p>
 *
 * <p>Usage example:
 * <pre>
 *     Integer[] arr = {5, 3, 8, 4, 2};
 *     Selection selection = new Selection();
 *     Comparable kthSmallest = selection.select(arr, 2); // Finds the 3rd smallest element
 * </pre>
 * </p>
 */
public class QuickSelection extends QuickSort {

    public QuickSelection() {
    }

    /**
     * Finds the k-th smallest element in the array using the QuickSelect algorithm.
     * The array is shuffled before selection to guarantee good performance.
     *
     * @param a the array of Comparable elements
     * @param k the index (0-based) of the desired smallest element
     * @return the k-th smallest element in the array
     * @throws IllegalArgumentException if k is out of bounds
     */
    public Comparable select(Comparable[] a, int k) {
        shuffle(a);

        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                return a[k];
            }
        }
        return a[k];
    }
}
