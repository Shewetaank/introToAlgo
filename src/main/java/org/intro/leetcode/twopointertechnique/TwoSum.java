package org.intro.leetcode.twopointertechnique;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;

/**
 * Given a sorted array find 2 elements whose sum is equal to a given number K.
 */
public class TwoSum {

    public Pair<Integer, Integer> twoSumPair(int[] a, int k) {

        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i] + a[j] == k) {
                    return Pair.of(a[i], a[j]);
                }
            }
        }
        return null;
    }

    public boolean twoSumBSearch(int[] a, int k) {
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int compliment = k - a[i];

            // Binary Search for temp
            int low = i + 1;
            int high = a.length - 1;

            while (low <= high) {
                int mid = low + (high - low)/2;
                if (a[mid] == compliment) {
                    return true;
                } else if (a[mid] < compliment) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public Pair<Integer, Integer> twoSumOptimized(int[] a, int k) {
        Arrays.sort(a);

        int i = 0, j = a.length - 1;

        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == k) {
                return Pair.of(a[i], a[j]);
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }

        return null;
    }
}
