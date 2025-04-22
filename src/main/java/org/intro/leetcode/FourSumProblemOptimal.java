package org.intro.leetcode;

import java.util.*;

public class FourSumProblemOptimal {

    static class SumPair {
        private final int first;
        private final int sec;

        public SumPair(int a, int b) {
            this.first = a;
            this.sec = b;
        }
    }

    private Map<Integer, SumPair> twoSum(int[] a) {
        Map<Integer, SumPair> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                map.put(a[i] + a[j], new SumPair(i, j));
            }
        }
        return map;
    }

    public List<List<Integer>> fourSum(int[] a, int t) {
        Map<Integer, SumPair> map = twoSum(a);
        return fourSum(a, t, map);
    }
    private List<List<Integer>> fourSum(int[] a, int t, Map<Integer, SumPair> twoSum) {

        List<List<Integer>> res = new ArrayList<>();
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int currentSum = a[i] + a[j];

                if (twoSum.containsKey(t - currentSum)) {
                    SumPair pair = twoSum.get(t - currentSum);

                    if (pair.first != i && pair.first != j
                    && pair.sec != i && pair.sec != j
                    && temp[i] == 0
                    && temp[j] == 0
                    && temp[pair.first] == 0
                    && temp[pair.sec] == 0) {
                        temp[pair.sec] = 1;
                        temp[pair.first] = 1;
                        temp[i] = 1;
                        temp[j] = 1;
                        res.add(Arrays.asList(a[i], a[j], a[pair.first], a[pair.sec]));
                    }
                }
            }
        }
        return res;
    }
}
