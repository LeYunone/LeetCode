package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-10 13:56
 * 200. 岛屿数量
 */
public class Questions200 {

    public static void main(String[] args) {
        numIslands(new char[][] {{'1','0','1','1','0','1','1'}});
    }

    public static int numIslands(char[][] grid) {
        int xLen=grid[0].length;
        int yLen=grid.length;
        int result=0;
        for(int i=0;i<yLen;i++){
            for(int j=0;j<xLen;j++){
                if(grid[i][j]=='1'){
                    backOrder(grid,j,i);
                    result++;
                }
            }
        }
        return result;
    }

    public static void backOrder(char [] [] grid ,int x,int y ){
        if(x<0 || x>=grid[0].length || y<0 || y>=grid.length || grid[y][x]!='1'){
            return;
        }
        grid[y][x]='0';
        backOrder(grid,x+1,y);
        backOrder(grid,x-1,y);
        backOrder(grid,x,y+1);
        backOrder(grid,x,y-1);
    }
}
