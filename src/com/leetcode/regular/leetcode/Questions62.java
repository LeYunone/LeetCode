package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-15 14:39
 * 62. 不同路径
 */
public class Questions62 {

    public static void main(String[] args) {
        uniquePaths(3,7);
    }

    public static int uniquePaths(int m, int n) {
        if(n<=1 || m<=1){
            return 1;
        }
        int [] [] dp=new int [m][n];

        for(int i=1;i<m;i++){
            dp[i][0]=1;
            for(int j=1;j<n;j++){
                dp[0][j]=1;
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1  ];
    }
}
