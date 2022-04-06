package com.leetcode.sort;

/**
 * @author pengli
 * @create 2022-04-06 16:38
 * 选择排序   白话：默认选择第一个为当前数组最小，通过循环判断，选择出当前最小的数字与默认位置进行交换
 */
public class SelectionSort {

    public static int[] arr = {4, 2, 5, 7, 3, 10, 2, 1, 6};

    public static void main (String[] args) {
        for(int i=0;i<arr.length;i++){
            int index = i;
            for(int j=i;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index= j ;
                }
            }
            if(index!=i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        SystemArray.systemArr(arr);
    }
}
