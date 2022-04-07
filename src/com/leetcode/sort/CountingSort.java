package com.leetcode.sort;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2022-04-07 10:58
 * 计数排序 白话： 找到最大值，构造最大值长度的数组。 将数组值与新建数组下标进行累计匹配。
 * 遍历新数组，当遇到不为0的下标值时，说明从左往右扫描的话，这个值是排序数组最小值，记录到最左为并且移动原数组的i下标。新数组下标--
 */
public class CountingSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main (String[] args) {
        int max = 0;
        for(int i :arr){
            if(i>max){
                max = i;
            }
        }
        int [] bucket=new int [max+1];
        Arrays.fill(bucket,0);
        for(int i:arr){
            bucket[i]++;
        }
        int index = 0;
        int i= 0;
        while(index<arr.length){
            if(bucket[i]!=0){
                arr[index] = i;
                bucket[i]--;
                index++;
            }else{
                i++;
            }
        }
        SystemArray.systemArr(arr);
    }
}
