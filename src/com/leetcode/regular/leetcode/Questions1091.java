package com.leetcode.regular.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-11-10 09:36
 * 1091. 二进制矩阵中的最短路径
 */
public class Questions1091 {

    public static void main(String[] args) {
        shortestPathBinaryMatrix(new int[] []{{0}});
    }

    public static   int shortestPathBinaryMatrix(int[][] grid) {
        int [] [] moves=new int [] [] {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        int yLen=grid.length;
        int xLen=grid[0].length;
        Queue<int []> queue=new LinkedList();
        if(grid[0][0]!=0 || grid[yLen-1][xLen-1]!=0){
            return -1;
        }
        queue.add(new int [] {0,0,1});
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int y=poll[0];
            int x=poll[1];
            int dis=poll[2];
            for(int [] move:moves){
                int newY=y+move[0];
                int newX=x+move[1];
                if(newY<yLen && newY>=0 && newX>=0 && newX<xLen && grid[newY][newX]==0){
                    queue.add(new int [] {newY,newX,dis+1});
                    grid[newY][newX]=1;
                }else{
                    continue;
                }
                if(newY==yLen-1 && newX==xLen-1){
                    return dis+1;
                }
            }
        }
        return xLen==1&&yLen==1?1:-1;
    }
}
