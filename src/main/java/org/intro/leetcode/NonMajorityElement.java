package org.intro.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NonMajorityElement {

    Set<Integer> test = new HashSet<>();
    public boolean noMajorityElement(int[] nums) {
        test.clear();
        if (nums.length == 1) {
            return true;
        }
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                count = count + 1;
            } else if (nums[i] != result) {
                count = count - 1;
            }
        }
        return false;
    }
}
