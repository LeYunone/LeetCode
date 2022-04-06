package com.leetcode.sort;

/**
 * @author pengli
 * @date 2022-04-06
 * 快速排序 : 
 */
public class QuickSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main(String[] args) {
        
    }
    
    public static int [] quickSort(int start,int end,int [] arrs){
        int left=start;
        int right=end;
        while(left!=right){
            int temp = arrs[left];
            if(arrs[right]<temp){
                arrs[left] = arrs[right];
            }
        }
    }
}
