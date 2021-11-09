package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-09 14:37
 */
public class Questions55 {

    public static void main(String[] args) {
        canJump(new int [] {2,0,0});
    }

    public static boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length!=1){
            return false;
        }
        int [] dp=new int [nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]-1,nums[i]);
            if(dp[i]==0 && i!=nums.length-1){
                return false;
            }
        }
        return true;
    }
}
