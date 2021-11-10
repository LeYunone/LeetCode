package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-10 09:36
 * 1091. 二进制矩阵中的最短路径
 */
public class Questions1091 {

    public static void main(String[] args) {
        shortestPathBinaryMatrix(new int [][] {{0,0,0},{1,1,0},{1,1,0}});
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        return order(grid,0,0,1);
    }

    public static int order(int [] [] grid,int x,int y,int result){
        if(x>=grid[0].length || y>=grid.length || x<0 || y<0 || grid[x][y]!=0){
            return -1;
        }
        if(x==grid[0].length-1 && y==grid.length-1){
            return result;
        }
        int order = order(grid, x + 1, y, result + 1);
        int order1 = order(grid, x + 1, y + 1, result + 1);
        int order2 = order(grid, x, y + 1, result + 1);
        int order3 = order(grid, x - 1, y + 1, result + 1);
        int order4 = order(grid, x - 1, y, result + 1);
        int order5 = order(grid, x - 1, y - 1, result + 1);
        int order6 = order(grid, x, y - 1, result + 1);
        int order7 = order(grid, x + 1, y - 1, result + 1);
        Set<Integer> set=new LinkedHashSet<>();
        set.add(order);
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);
        set.add(order6);
        set.add(order7);
        Iterator<Integer> iterator = set.iterator();
        Integer next = iterator.next();
        if(next!=-1){
            return next;
        }else{
            return iterator.next();
        }
    }
}
