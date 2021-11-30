package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-24 14:08
 * 88. 合并两个有序数组
 */
public class Questions88 {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 0, 0, 0};
        int[] ar2 = {2, 5, 6};
        merge(ar, 3, ar2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mright = m - 1;
        int nright = n - 1;
        int tar = m + n - 1;
        int temp = 0;
        while (mright >= 0 || nright >= 0) {
            if (mright == -1) {
                temp = nums2[nright--];
            } else if (nright == -1) {
                temp = nums1[mright--];
            } else if (nums2[nright] > nums1[mright]) {
                temp = nums2[nright--];
            } else {
                temp = nums1[mright--];
            }
            nums1[tar--] = temp;
        }
    }
}

