package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-05 16:34
 */
public class Questions746 {

    public static void main(String[] args) {
        minCostClimbingStairs(new int []{10,15,20});
    }

    public static int minCostClimbingStairs(int[] cost) {
        int [] dp=new int [cost.length+1];
        dp[0]=dp[1]=0;
        for(int i=2;i<=cost.length;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
