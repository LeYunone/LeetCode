package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-23 10:21
 */
public class Questions518 {

    public static void main(String[] args) {
        change(5,new int []{1,2,5});
    }

    public static int change(int amount, int[] coins) {
        int [] dp=new int [amount+1];
        dp[0]=1;
        for(int j:coins){
            for(int i=j;i<=amount;i++){
                int temp=i-j;
                dp[i]+=dp[temp];
            }
        }
        return dp[amount];
    }
}
