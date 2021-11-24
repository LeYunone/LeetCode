package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-17 13:32
 */
public class Questions309 {

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [] [] dp=new int [prices.length] [3] ;
        dp[0][0]=-prices[0];
        for(int i=0;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);
            dp[i][1]=dp[i-1][0]+prices[i];
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][2]);
        }
        return Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
    }
}
