package com.leetcode.regular.leetcode;

import sun.security.util.Length;

/**
 * @author pengli
 * @create 2021-11-02 14:11
 *
 * 74. 搜索二维矩阵
 */
public class Questions74 {

    public static void main(String[] args) {
        int [] [] ar=new int [] [] {{1},{3}};
        searchMatrix(ar,1);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int y=0;
        int len=matrix.length;
        int xlen=matrix[0].length-1;
        int left=0;
        int right=xlen;
        if(len==1 && matrix[0].length==1){
            return matrix[0][0]==target;
        }
        while(y<len){
            if(matrix[y][0]<=target && matrix[y][xlen]>=target){
                while(right>=left){
                    int mid=(right-left)/2+left;
                    if(matrix[y][mid]==target){
                        return true;
                    }
                    if(matrix[y][mid]>target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
                return false;
            }else{
                y++;
            }
        }
        return false;
    }

}
