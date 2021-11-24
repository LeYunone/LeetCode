package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-23 10:50
 */
public class Questions516 {

    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        int [] [] dp=new int [s.length()] [s.length()];
        for(int i=n-1;i>=0;i--){
            dp[i][i]=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}

