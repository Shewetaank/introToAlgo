package org.intro.leetcode;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(nums));
        nums = new int[]{10, 10, 10};
        System.out.println(secondLargest(nums));
        nums = new int[]{10, 5, 10};
        System.out.println(secondLargest(nums));
    }

    private static int secondLargest(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(a[i], max);
        }
        int minDiff = Integer.MAX_VALUE;
        int secondLargest = -1;
        for (int i = 0; i < a.length; i++) {
            int currentDiff = max - a[i];
            if (currentDiff > 0 && currentDiff < minDiff) {
                minDiff = currentDiff;
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }
}
