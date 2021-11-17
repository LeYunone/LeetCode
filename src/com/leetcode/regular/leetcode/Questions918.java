package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-09 16:00
 */
public class Questions918 {

    public static void main(String[] args) {
        maxSubarraySumCircular(new int [] {-2,-3,-1});
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int preMax=0;
        int preMin=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            preMax=Math.max(preMax+nums[i],nums[i]);
            preMin=Math.min(preMin+nums[i],nums[i]);
            max=Math.max(max,preMax);
            min=Math.min(min,preMin);
        }
        return sum-min==0?max:Math.max(sum-min,max);
    }
}
