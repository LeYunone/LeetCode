package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-12 16:03
 * 1567. 乘积为正数的最长子数组长度
 */
public class Questions1567 {

    public static void main(String[] args) {
        getMaxLen(new int [] {1,-2,-3,4});
    }

    public static int getMaxLen(int[] nums) {
        int len=nums[0]>0?1:0;
        int [] dp=new int [nums.length];
        int [] dpIndex=new int [nums.length];
        if(nums[0]>0){
            dp[0]=1;
        }else if(nums[0]<0){
            dpIndex[0]=1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0){
                dp[i]=dp[i-1]+1;
                dpIndex[i]=dpIndex[i-1]>0?dpIndex[i-1]+1:0;
            }else if (nums[i]<0){
                dp[i]=dpIndex[i-1]>0?dpIndex[i-1]+1:0;
                dpIndex[i]=dp[i-1]+1;
            }
            len=Math.max(len,dp[i]);
        }
        return len;
    }

}
