package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-09 10:51
 */
public class Questions198 {

    public static void main(String[] args) {
        rob(new int [] {2,1,1,2});
    }

    public static int rob(int[] nums) {
        int len=nums.length;
        int [] dp=new int [len];
        if(len>2){
            dp[0]=nums[0];
            dp[1]=Math.max(nums[1],nums[0]);
        }else{
            if(len==1){
                return nums[0];
            }else{
                return Math.max(nums[0],nums[1]);
            }
        }
        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];
    }

}
