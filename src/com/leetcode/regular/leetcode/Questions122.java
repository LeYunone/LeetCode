package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-17 09:58
 */
public class Questions122 {

    public int maxProfit(int[] prices) {
        int [] dp=new int [prices.length];
        int index=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<index){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+prices[i]-index;
            }
            index=prices[i];
        }
        return dp[prices.length-1];
    }
}
