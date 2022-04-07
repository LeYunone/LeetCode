package com.leetcode.sort;

/**
 * @author pengli
 * @create 2022-04-07 10:32
 * 堆排序 白话：  首先是构建最大堆是最重要的过程：将数组打在二叉树节点上，从最远的根节点开始遍历(len-1/2) ，[len-1/2、(len-1/2)*2、(len-1/2)*2+1]为
 * 一组堆，进行比较排序，将三者中的最大值调整到根节点上，并且被调下去的根节点，继续以此节点维持下面所有堆的最大堆原则。
 * 循环遍历，最后得到一个最大堆[最大值在根节点]。
 * 交换根节点与最后一节点的位置，[将该节点从逻辑上移除]。并且以根节点出发，维持最大堆的同时，不断的移除每次维持之后的最大堆根节点。
 */
public class HeapSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main (String[] args) {
        heapSort();
        int len = arr.length;
        while(len>0){
            int temp=arr[0];
            arr[0] = arr[len-1];
            arr[len-1] = temp;
            getMaxHeap(arr,0);
            len--;
        }
        SystemArray.systemArr(arr);
    }

    public static void heapSort(){
        for(int i = (arr.length-1)/2 ; i>=0;i--){
            getMaxHeap(arr,i);
        }
    }

    public static void getMaxHeap (int[] arrs, int i) {
        int temp = i;
        if (i * 2 < arrs.length && arrs[i * 2] > arrs[temp]) {
            temp = i*2;
        }
        if (i * 2 + 1 < arrs.length && arrs[i * 2 + 1] > arrs[temp]) {
            temp = i*2+1;
        }
        if(temp != i ){
            int num = arrs[i];
            arrs[i] = arrs[temp];
            arrs[temp] = num;

            getMaxHeap(arrs,temp);
        }
    }
}
