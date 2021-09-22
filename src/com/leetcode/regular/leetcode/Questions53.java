package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-15 10:12
 * 53. 最大子序和
 */
public class Questions53 {

    public static void main(String[] args) {
        int [] s={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(s);
    }

    public static int maxSubArray(int[] nums) {

        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
