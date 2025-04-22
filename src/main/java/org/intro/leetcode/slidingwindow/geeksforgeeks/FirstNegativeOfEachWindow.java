package org.intro.leetcode.slidingwindow.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeOfEachWindow {

    public static List<Integer> firstNegative(int[] a, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> di = new ArrayList<>();
        int i;
        for (i = 0; i < k; i++) {
            if (a[i] < 0) {
                res.add(a[i]);
            }
        }


        for (; i < a.length; i++) {
            if (!di.isEmpty()) {
                res.add(a[i]);
            } else {
                res.add(0);
            }


            if (a[i] < 0) {
                di.add(i);
            }
        }

        return res;
    }
}
