package org.intro.leetcode.twopointertechnique;

/**
 * Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.
 */
public class TwoSumClosest {

    public Integer twoSum(int[] a, int k) {
        int N = a.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = a[i] + a[j] - k;

                if (Math.abs(sum) < Math.abs(res)) {
                    res = sum;
                }
            }
        }
        return res;
    }
}
