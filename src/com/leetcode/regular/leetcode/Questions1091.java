package com.leetcode.regular.leetcode;


import java.util.ConcurrentModificationException;

/**
 * @author pengli
 * @create 2021-11-10 09:36
 * 1091. 二进制矩阵中的最短路径
 */
public class Questions1091 {

    public static void main(String[] args) {
        shortestPathBinaryMatrix(new int [][] {{1,0,0},{1,1,0},{1,1,0}});
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        boolean [] [] visred=new boolean [grid.length] [grid[0].length];
        int [] min=new int [] {-1};
        order(min,visred, grid, 0, 0, 0);
        return min[0];
    }

    public static void order(int [] min,boolean [] [] visted,int [] [] grid,int x,int y,int result){
        if(grid[y][x]==1){
            return;
        }
        result++;
        visted[y][x]=true;
        if(x==grid[0].length-1 && y==grid.length-1){
            if(min[0]==-1){
                min[0]=result;
            }else{
                min[0]=Math.min(min[0],result);
            }
            return;
        }

        int [] [] moves=new int [] [] {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int [] move:moves){
            int newX=x+move[1];
            int newY=y+move[0];
            if(newX>=0 && newX<grid[0].length && newY>=0 && newY<grid.length && !visted[newY][newX] && grid[newY][newX] ==0){
                order(min,visted,grid,newX,newY,result);
                visted[newY][newX]=false;
            }
        }
        return;
    }
}
