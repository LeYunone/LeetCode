package com.leetcode.regular.leetcode;


/**
 * @author pengli
 * @create 2021-11-26 10:15
 * 566. 重塑矩阵
 */
public class Questions566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length; int n=mat[0].length;
        if(m*n>r*c){
            return mat;
        }
        return null;
    }
}
