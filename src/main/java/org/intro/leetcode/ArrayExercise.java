package org.intro.leetcode;

public class ArrayExercise {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 3, 3, 6, 6, 6, 7, 8, 8};
        System.out.println(findUniqueElement(nums, 3));
        System.out.println(findUniqueElement(nums, 2));
    }

    /**
     * nums is sorted in decreasing or increasing order
     * there only exists one unique element
     * 1 <= nums.length <= 100
     */
    private static int findUniqueElement(int[] nums, int frequency) {
        if (nums.length == 1) {
            return nums[0];
        }
        int unique = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == unique) {
                count++;
            } else if (count == frequency) {
                return unique;
            } else {
                unique = nums[i];
                count = 1;
            }
        }
        if (count == frequency) {
            return unique;
        } else {
            return 0;
        }
    }
}
