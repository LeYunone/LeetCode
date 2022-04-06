package com.leetcode.sort;

/**
 * @author pengli
 * @create 2022-04-06 17:01
 * 插入排序：
 */
public class InsertionSort {

    public static int[] arr = {4, 2, 5, 7, 3, 10, 2, 1, 6};

    public static void main (String[] args) {
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[index]){
                continue;
            }
            int temp = i;
            while(temp>=0 && arr[temp] >arr[index]){

            }
        }
    }
}
