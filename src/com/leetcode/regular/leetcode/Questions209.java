package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-08 15:51
 */
public class Questions209 {

    public static void main(String[] args) {
        minSubArrayLen(7,new int [] {2,3,1,2,4,3});
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                min=Math.min(min,end-start);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
