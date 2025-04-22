package org.intro.leetcode;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class TwoSumProblem {

    public static boolean twoSumExists(int[] a, int x) {
        int[] aux = new int[a.length];
        int l = 0, r = a.length -1;
        sort(a, aux, l, r);

        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == x) {
                return true;
            } else if (sum > x) {
                r--;
            } else {
                l++;
            }
        }

        return false;
    }

    public static Map<Integer, Integer> findTwoSumPairs(int[] a, int x) {
        Map<Integer, Integer> r = new HashMap<>();
        for (int k = 0 ; k < a.length; k++) {
            int temp = x - a[k];
            if (r.containsKey(temp)) {
                r.put(temp, a[k]);
            } else {
                r.put(a[k], null);
            }
        }

        r.values().removeAll(Collections.singleton(null));
        return r;
    }

    public static boolean findTwoSumUsingHashing(int[] a, int x) {
        Set<Integer> s = new HashSet<>();
        for (int k = 0; k < a.length; k++) {
            int temp = x - a[k];
            if (s.contains(temp)) {
                return true;
            } else {
                s.add(a[k]);
            }
        }
        return false;
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1 , hi);
        if (!less(a[mid+1], a[mid])) {
            return;
        }
        merge(a, aux, lo, mid, hi);
    }

    private static boolean less(int a, int b) {
        return a < b;
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
}
