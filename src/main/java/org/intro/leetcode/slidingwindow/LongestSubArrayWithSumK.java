package org.intro.leetcode.slidingwindow;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        System.out.println(longestSubArray(arr, k));
    }

    public static int longestSubArray(int[] a, int k) {
        int prefSum = 0;
        int longest = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; ++i) {
            prefSum += a[i];

            if (prefSum == k) {
                longest = i + 1;
            } else if (map.containsKey(prefSum - k)) {
                longest = Math.max(longest, i - map.get(prefSum - k));
            }

            if (!map.containsKey(prefSum)) {
                map.put(prefSum, i);
            }
        }

        return longest;
    }
}
