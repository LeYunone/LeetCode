package com.leetcode.regular.leetcode;

import com.sun.deploy.util.StringUtils;

/**
 * @author pengli
 * @create 2021-11-19 16:43
 */
public class Questions221 {

    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [] [] dp=new int [m] [n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                }else{
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                    int temp=dp[i][j]*dp[i][j];
                    max=Math.max(max,temp);
                }
            }
        }
        return max;
    }
}
