package com.leetcode.sort;

/**
 * @author pengli
 * @date 2022-04-06
 * 快速排序 :  白话：定位一个数，首先从数组右边往左扫描，当找到比这个数小的，就与left下标位置进行交换，否则继续移动right下标，直到遇到小于
 * temp的数或者与left重合。 然后交替，从左往右扫描，同上理，找到比temp大的，交换right位置，直到找到。
 */
public class QuickSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main(String[] args) {

        quickSort(0,arr.length-1,arr);
        SystemArray.systemArr(arr);
    }

    public static void quickSort(int start,int end,int [] arrs){
        if(end>start && start>=0 && end<=arr.length-1){
            int quick = quick(start, end, arrs);
            quickSort(start,quick-1,arrs);
            quickSort(quick+1,end,arrs);
        }
    }
    
    public static int quick(int start,int end,int [] arrs){
        int left=start;
        int right=end;
        int temp = arrs[left];
        while(left!=right){
            while(arrs[right]>temp && right>left){
                right--;
            }
            arrs[left] = arrs[right];
            while(arrs[left]<temp && left<right){
                left++;
            }
            arrs[right] = arrs[left];
        }
        arrs[right] = temp;
        return right;
    }
}
