package com.leetcode.sort;

import java.util.Arrays;

/**
 * @author pengli
 * @date 2022-04-06
 * 归并排序： 将一个数组 分成最小单位2的数组进行排序。 
 */
public class MergeSort {

    public static int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 3, 6, 10, 1};
        int[] ints = mergetSort(arr);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergetSort(int[] arrs) {
        if (arrs.length < 2) {
            return arrs;
        }
        int mid = arrs.length / 2;
        int left[] = Arrays.copyOfRange(arrs, 0, mid);
        int right[] = Arrays.copyOfRange(arrs, mid, arrs.length);
        return merget(mergetSort(left), mergetSort(right));
    }

    public static int[] merget(int[] left, int[] right) {
        int result[] = new int[left.length + right.length];
        for (int index = 0, l = 0, r = 0; index < result.length; index++) {
            if (r>=left.length) {
                result[index] = left[l++];
            } else if (l>=right.length) {
                result[index] = right[r++];
            } else if (left[l] > right[r]) {
                result[index] = right[r++];
            } else {
                result[index] = left[l++];
            }
        }
        return result;
    }
}
