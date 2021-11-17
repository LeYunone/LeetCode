package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-16 16:33
 */
public class Questions931 {

    public static void main(String[] args) {
        minFallingPathSum(new int [] [] {{2,1,3},{6,5,4},{7,8,9}});
    }

    public static int minFallingPathSum(int[][] matrix) {
        int [][] dp=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            dp[0][i]=matrix[0][i];
        }
        int min=dp[0][0];
        for(int i=1;i<matrix.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(j==0){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j+1])+matrix[i][j];
                }else if(j==matrix[0].length-1){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+matrix[i][j];
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j+1]),dp[i-1][j-1])+matrix[i][j];
                }
                min=Math.min(min,dp[i][j]);
            }
        }
        return min;
    }
}
