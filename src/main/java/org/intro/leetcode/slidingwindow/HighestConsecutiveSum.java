package org.intro.leetcode.slidingwindow;

public class HighestConsecutiveSum {

    public static void main(String[] args) {
        int[] a = {1, 2, 6, 2, 4, 1};

        System.out.println(consecutiveSum(a, 3));
        System.out.println(consecutiveSum(a, 2));
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(consecutiveSum(arr, 4));
    }

    private static int consecutiveSum(int[] a, int window) {
        if (a.length < window) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = 0; i < window; i++) {
            sum += a[i];
        }

        int currentSum = sum;
        for (int j = window; j < a.length; j++) {
            currentSum += a[j] - a[j-window];
            sum = Math.max(sum, currentSum);
        }

        return sum;
    }
}
