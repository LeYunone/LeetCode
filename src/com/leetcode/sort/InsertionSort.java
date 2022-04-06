package com.leetcode.sort;

/**
 * @author pengli
 * @date 2022-04-06
 * 插入排序 ： 遍历数据，控制前index为有序，遍历下一次时，判断这次的下标值和前一次有序数组的最大值比较。如果小的话，则进入
 * 当前范围数组的排序，规则就是不停的用最大值与当前值进行比较，直到找到比这个值小的，将当前值“插入”到该值前面。
 */
public class InsertionSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            int index = i;
            while (index >= 0 && arr[index] > temp) {
                arr[index+1] = arr[index]; 
                index--;
            }
            if(index!=i){
                arr[index+1] = temp;
            }
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
