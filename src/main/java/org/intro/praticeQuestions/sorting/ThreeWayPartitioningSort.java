package org.intro.praticeQuestions.sorting;

/**
 * Implementation of Three-Way Partitioning Quick Sort algorithm.
 * This sorting algorithm is particularly efficient for arrays with many duplicate keys.
 * It partitions the array into three parts:
 * - Elements less than the pivot
 * - Elements equal to the pivot
 * - Elements greater than the pivot
 * 
 * This approach reduces the number of comparisons when there are many duplicate elements
 * compared to traditional quicksort.
 */
public class ThreeWayPartitioningSort extends AbstractSort {

    /**
     * Sorts the given array using three-way partitioning quicksort.
     * 
     * @param a the array to be sorted
     * @throws IllegalArgumentException if the array is null
     */
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    /**
     * Recursively sorts the subarray a[lo..hi] using three-way partitioning.
     * 
     * @param a  the array to be sorted
     * @param lo the index of the first element in the subarray
     * @param hi the index of the last element in the subarray
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        // Three-way partitioning
        int lt = lo, gt = hi;  // lt: less than pivot, gt: greater than pivot
        Comparable v = a[lo];  // pivot element
        int i = lo;
        
        // Partition the array into three parts
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                // Current element is less than pivot
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                // Current element is greater than pivot
                exch(a, i, gt--);
            } else {
                // Current element is equal to pivot
                i++;
            }
        }

        // Recursively sort the subarrays
        sort(a, lo, lt - 1);    // Sort elements less than pivot
        sort(a, gt + 1, hi);    // Sort elements greater than pivot
    }
}
