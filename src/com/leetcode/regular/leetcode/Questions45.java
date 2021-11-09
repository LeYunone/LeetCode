package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-09 15:20
 */
public class Questions45 {

    public static void main(String[] args) {
        jump(new int []{2,3,1,2,4,2,3});
    }

    public static int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

}
