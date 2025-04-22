package org.intro.dataStructure.letcode;

import org.apache.commons.lang3.tuple.Pair;
import org.intro.leetcode.TwoSumProblem;
import org.junit.Test;

public class TwoSumProblemTest {

    @Test
    public void testTwoSum() {
        int[] id = {-8, 1, 4, 6, 10, 45};
        var result = TwoSumProblem.twoSumExists(id, 16);
        assert result;
    }

    @Test
    public void testTwoSumUsingHashing() {
        int[] id = {-8, 1, 4, 6, 10, 45};
        var result = TwoSumProblem.findTwoSumUsingHashing(id, 0);
        assert result;
    }

    @Test
    public void testTwoSumPairs() {
        int[] id = {0, 3, -1, 4, 2, 5, -2};
        var result = TwoSumProblem.findTwoSumPairs(id, 2);
        result.forEach((k, v) -> {
            System.out.println(k + ", " + v);
        });
    }
}
