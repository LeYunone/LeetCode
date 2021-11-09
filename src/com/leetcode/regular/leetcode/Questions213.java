package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-09 13:16
 * 213. 打家劫舍 II
 */
public class Questions213 {

    public int rob(int[] nums) {
        int len=nums.length;
        if(len<=2){
            if(len==1){
                return nums[0];
            }else{
                return Math.max(nums[0],nums[1]);
            }
        }

        int [] dp=new int [len];
        dp[1]=nums[1];
        dp[2]=Math.max(nums[1],nums[2]);
        for(int i=3;i<len;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return Math.max(dp[len-1],dp[len-1]-nums[len-1]+nums[0]);
    }
}
