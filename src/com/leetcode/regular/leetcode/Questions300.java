package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-17 15:06
 */
public class Questions300 {

    public static void main(String[] args) {
        lengthOfLIS(new int [] {
                7,7,7,7,7,7});
    }

    public static int lengthOfLIS(int[] nums) {
        int [] dp=new int [nums.length];
        int result=1;
        for(int i=0;i<nums.length;i++){
            int max=1;
            dp[i]=1;
            for(int j=i;j>=0;j--){
                if(nums[j]<nums[i]){
                    max=Math.max(max,dp[j]+1);
                    dp[i]=max;
                }
            }
            result=Math.max(dp[i],result);
        }
        return result;
    }
}
