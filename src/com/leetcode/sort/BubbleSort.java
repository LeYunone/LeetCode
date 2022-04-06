package com.leetcode.sort;

/**
 * @author pengli
 * @create 2022-04-06 16:04
 * 冒泡排序  白话：两次循环，每次找到数组中的最大值到队尾
 */
public class BubbleSort {

    public static int[] arr = {4, 2, 5, 7, 3, 10, 2, 1, 6};

    public static void main (String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        SystemArray.systemArr(arr);
    }

    //优化方案
    public void test2 () {
        for (int i = 0; i < arr.length; i++) {
            boolean is = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    is=false;
                }
            }
            if(is){
                break;
            }
        }
    }
}
