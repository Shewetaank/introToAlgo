package org.intro.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountDistinctElementOfSizeK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        List<Integer> res = gfg(arr, 4);
        for (int a : res) {
            System.out.println(a);
        }
    }

    public static List<Integer> gfg(int[] a, int k) {
        List<Integer> res = new ArrayList<>();

        int i;
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for (i = 0; i < k; i++) {
            numFreq.put(a[i], numFreq.getOrDefault(a[i], 0) + 1);
        }

        res.add(numFreq.size());

        for (i = k ; i < a.length; i++) {
            numFreq.put(a[i], numFreq.getOrDefault(a[i], 0) + 1);
            numFreq.put(a[i-k], numFreq.get(a[i-k]) - 1);

            if (numFreq.get(a[i-k]) == 0) {
                numFreq.remove(a[i-k]);
            }

            res.add(numFreq.size());
        }

        return res;
    }
}
