package org.intro.leetcode.twopointertechnique;

import org.junit.Test;

public class TwoSumClosestTest {

    @Test
    public void test() {
        TwoSumClosest twoSum = new TwoSumClosest();

        int[] a = {0, -8, -6, 3};
        int res = twoSum.twoSum(a, 0);
        System.out.println(res);

        a = new int[]{0, -8, -6, 3, 2, -4, -5};
        res = twoSum.twoSum(a, 1);
        System.out.println(res);

    }
}
