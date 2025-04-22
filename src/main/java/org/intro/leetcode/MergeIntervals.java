package org.intro.leetcode;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        boolean[] state = new boolean[intervals.length];
        int i = 0;
        int end = intervals[i][1];
        while (i < intervals.length - 1) {
            if (isOverlap(intervals[i], intervals[i+1])) {
                state[i] = true;
                state[i+1] = true;
            }
            if (end >= intervals[i+1][1]) {
                state[i+1] = true;
            }
            end = Math.max(end, intervals[i+1][1]);
            i++;
        }

        Map<Integer, Integer> map = new HashMap<>();
        i = 0;
        int j = i;
        while (i < state.length) {
            if (j < state.length - 1 && state[j]) {
                j++;
            } else {
                if (state[j]) {
                    map.put(intervals[i][0], Math.max(intervals[i][1], intervals[j][1]));
                } else {
                    map.put(intervals[i][0], Math.max(intervals[i][1], intervals[j-1][1]));
                }
                i = j + 1;
            }
        }

        int[][] res = new int[map.size()][2];
        i = 0;
        for (var entry : map.entrySet()) {
            res[i][0] = entry.getKey();
            res[i][1] = entry.getValue();
            i++;
        }
        return res;
    }

    private boolean isOverlap(int[] a, int[] b) {
        return a[1] >= b[0];
    }
}
