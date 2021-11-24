package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-24 09:48
 */
public class Questions377 {

    public static void main(String[] args) {
        combinationSum4(new int [] {1,2,3},4);
    }

    public static int combinationSum4(int[] nums, int target) {
        int [] dp=new int [target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int num:nums){
                int temp=i-num;
                if(temp<0){
                    continue;
                }
                dp[i]+=dp[temp];
            }
        }
        return dp[target];
    }
}
