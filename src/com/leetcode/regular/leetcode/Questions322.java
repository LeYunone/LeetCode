package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-11-11 14:16
 * 322. 零钱兑换
 */
public class Questions322 {

    public static void main(String[] args) {
        int i = coinChange(new int[]{2}, 3);
        System.out.println();
    }

    public static int coinChange(int[] coins, int amount) {
        int len=amount+1;
        int dp[] =new int [len];
        Arrays.fill(dp, len);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=2;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<i){
                    dp[i]=Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
