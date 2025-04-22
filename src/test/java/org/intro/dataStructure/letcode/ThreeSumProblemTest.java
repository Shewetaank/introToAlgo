package org.intro.dataStructure.letcode;

import org.intro.leetcode.ThreeSumProblem;
import org.junit.Test;

public class ThreeSumProblemTest {

    @Test
    public void testThreeSum() {
        int[] id = {2, 3, 1, 7, 0, -4, 9};
        var result = ThreeSumProblem.threeSum(id, 5);
        result.forEach(System.out::println);
    }
}
