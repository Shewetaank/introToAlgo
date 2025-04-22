package org.intro.dataStructure.letcode;

import org.intro.leetcode.FourSumProblem;
import org.intro.leetcode.ThreeSumProblem;
import org.junit.Test;

import java.util.Arrays;

public class FourSumProblemTest {

    @Test
    public void testThreeSum() {
        int[] id = {2, 3, 1, 7, 0, -4, -1, 9};
        Arrays.sort(id);
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
        var result = FourSumProblem.fourSum(id, 6);
        result.forEach(System.out::println);
    }
}
