package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-18 15:16
 */
public class Questions63 {

    public static void main(String[] args) {
        uniquePathsWithObstacles(new int [] [] {{0,0}});
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(n<=1 || m<=1){
            return 1;
        }
        int [] [] dp=new int [m][n];
        dp[0][0]=obstacleGrid[0][0]==1?0:1;
        for(int i=1;i<m;i++){
            dp[i][0]=obstacleGrid[i][0]==1?0:1;
            for(int j=1;j<n;j++){
                dp[0][j]=obstacleGrid[0][j]==1?0:1;
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
