package org.intro.praticeQuestions.sorting;

/**
 * Implementation of Insertion Sort algorithm.
 * Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
 * It is efficient for small data sets and is often used as part of more sophisticated algorithms.
 * <p>
 * Time Complexity:
 * - Worst case: O(n²)
 * - Best case: O(n)
 * - Average case: O(n²)
 * <p>
 * Space Complexity: O(1) - in-place sorting algorithm
 */
public class InsertionSort extends AbstractSort {

    /**
     * Sorts the given array using the Insertion Sort algorithm.
     * The algorithm iterates through the array and for each element,
     * it places it in its correct position among the previously sorted elements.
     *
     * @param items The array of comparable items to be sorted
     * @throws IllegalArgumentException if items is null
     */
    public static void sort(Comparable[] items) {
        int N = items.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(items[j], items[j - 1])) {
                    exch(items, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static void sort(Comparable[] items, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo; j--) {
                if (less(items[j], items[j - 1])) {
                    exch(items, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }
}
