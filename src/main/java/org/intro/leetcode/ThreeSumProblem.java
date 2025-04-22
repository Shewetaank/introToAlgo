package org.intro.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public static int threeSumClosest(int[] a, int target) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);

        int closest = Integer.MAX_VALUE;
        for (int k = 0; k < a.length; k++) {
            int l = k + 1, r = a.length - 1;
            while (l < r) {
                int sum = a[k] + a[l] + a[r];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return closest;
    }

    public static List<List<Integer>> threeSum(int[] a, int target) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);

        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k < a.length; k++) {
            if (k > 0 && a[k] == a[k-1]) {
                continue;
            }
            int l = k + 1, r = a.length - 1;
            int rest = target - a[k];
            while (l < r) {
                int sum = a[l] + a[r];
                if (sum == rest) {
                    result.add(Arrays.asList(a[k], a[l], a[r]));
                    l++;
                    while (l < r && a[l] == a[l-1]) {
                        l++;
                    }
                } else if (sum < rest) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi -lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        if (!less(a[mid+1], a[mid])) {
            return;
        }
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(int a, int b) {
        return a < b;
    }
}
