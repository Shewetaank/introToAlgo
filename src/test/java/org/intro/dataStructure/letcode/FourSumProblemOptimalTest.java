package org.intro.dataStructure.letcode;

import org.intro.leetcode.FourSumProblemOptimal;
import org.junit.Test;

public class FourSumProblemOptimalTest {

    @Test
    public void testFourSum() {
        int[] arr = { 10, 20, 30, 40, 1, 2, 5, 15, 61 };
        System.out.println();
        var cls = new FourSumProblemOptimal();
        var result = cls.fourSum(arr, 91);
        result.forEach(System.out::println);
    }
}
