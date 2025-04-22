package org.intro.leetcode.twopointertechnique;

import java.util.Arrays;

public class ThreeSum {

    public boolean threeSum(int[] a, int res) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int sum = res - a[i];

            int j = i + 1;
            int k = a.length - 1;

            while (j < k) {
                int temp = a[j] + a[k];

                if (temp == sum) {
                    return true;
                } else if (temp > sum) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return false;
    }
}
