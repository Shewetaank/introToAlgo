package org.intro.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProblem {

    /**
     * time complexity O(n^3)
     */
    public static List<List<Integer>> fourSum(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i] == a[i-1]) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = a.length - 1;
                while (k < l) {
                    int sum = a[i] + a[j] + a[k] + a[l];
                    if (sum == t) {
                        res.add(Arrays.asList(a[i], a[j], a[k], a[l]));
                        k++;
                        l--;
                        while (k < l && a[k] == a[k-1]) {
                            k++;
                        }
                        while (k < l && a[l] == a[l+1]) {
                            l--;
                        }
                    }

                    if (t < sum) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return res;
    }
}
