package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-12 15:29
 * 152. 乘积最大子数组
 */
public class Questions152 {

    public static void main(String[] args) {
        maxProduct(new int [] {-4,-3,-2});
    }

    public static int maxProduct(int[] nums) {
        int max=nums[0];
        int maxIndex=nums[0];
        int minIndex=nums[0];
        for(int i=1;i<nums.length;i++){
            int mn=minIndex;
            int mx=maxIndex;
            maxIndex=Math.max(mx*nums[i],Math.max(nums[i],nums[i]*mn));
            minIndex=Math.min(mn*nums[i],Math.min(nums[i],nums[i]*mx));
            max=Math.max(max,maxIndex);
        }
        return max;
    }
}
