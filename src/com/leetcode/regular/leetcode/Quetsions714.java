package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-17 14:18
 */
public class Quetsions714 {

    public static void main(String[] args) {
        maxProfit(new int [] {1,3,2,8,4,9},2);
    }

    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
