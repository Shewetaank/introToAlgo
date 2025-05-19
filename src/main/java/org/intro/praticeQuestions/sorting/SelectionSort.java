package org.intro.praticeQuestions.sorting;

import static org.intro.praticeQuestions.sorting.AbstractSort.exch;
import static org.intro.praticeQuestions.sorting.AbstractSort.less;

/**
 * Implementation of Selection Sort algorithm.
 * Selection Sort is a simple sorting algorithm that works by repeatedly finding the minimum element
 * from the unsorted portion of the array and putting it at the beginning.
 * <p>
 * Time Complexity: O(n²) in all cases
 * Space Complexity: O(1) as it sorts in-place
 * 
 * @author org.intro
 */
public class SelectionSort {
    
    /**
     * Sorts an array of Comparable objects using the Selection Sort algorithm.
     * The algorithm works as follows:
     * 1. Find the minimum element in the unsorted portion of the array
     * 2. Swap it with the first element of the unsorted portion
     * 3. Move the boundary between sorted and unsorted portions one element to the right
     * 
     * @param items The array of Comparable objects to be sorted
     * @throws IllegalArgumentException if items is null
     */
    public static void sort(Comparable[] items) {
        int N = items.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(items[j], items[min])) {
                    min = j;
                }
            }
            exch(items, i, min);
        }
    }
}
