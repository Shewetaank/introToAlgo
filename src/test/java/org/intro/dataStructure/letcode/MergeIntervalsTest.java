package org.intro.dataStructure.letcode;

import org.intro.leetcode.MergeIntervals;
import org.junit.Test;

public class MergeIntervalsTest {

    @Test
    public void test() {
        int[][] arr =
         //       {{2,3},{4,5},{6,7},{8,9},{1,10}};
         {{1,3},{2,6},{8,10},{15,18}};
         //{{1,4},{0,2},{3,5}};
        System.out.println();
        var cls = new MergeIntervals();
        var result = cls.merge(arr);
        for (int[] ints : result) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
