package org.intro.leetcode.twopointertechnique;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test() {
        TwoSum twoSum = new TwoSum();

        int[] a = {10, 20, 35, 50, 55, 60, 70, 79, 90, 110};
        Pair<Integer, Integer> res = twoSum.twoSumPair(a, 110);
        System.out.println(res.getLeft() + " " + res.getRight());


        res = twoSum.twoSumOptimized(a, 85);
        System.out.println(res.getLeft() + " " + res.getRight());
    }

    @Test
    public void test2() {
        TwoSum twoSum = new TwoSum();

        int[] a = {10, 20, 35, 50, 55, 60, 70, 79, 90, 110};
        boolean res = twoSum.twoSumBSearch(a, 85);
        System.out.println(res);
    }
}
