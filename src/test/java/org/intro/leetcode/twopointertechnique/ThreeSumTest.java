package org.intro.leetcode.twopointertechnique;

import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void test() {

        ThreeSum threeSum = new ThreeSum();

        int[] a = {1, 4, 45, 6, 10, 8};
        System.out.println(threeSum.threeSum(a, 13));

        a = new int[]{1, 2, 4, 3, 6, 7};
        System.out.println(threeSum.threeSum(a, 10));

        a = new int[]{40, 20, 10, 3, 6, 7};
        System.out.println(threeSum.threeSum(a, 24));

    }
}
