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
        int p1 = m - 1;
        int p2 = n - 1;
        int tail  = m + n - 1;
        int cur = 0;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums2[p1] > nums1[p2]) {
                cur = nums2[p1--];
            } else {
                cur = nums1[p2--];
            }
            nums1[tail --] = cur;
        }
    }
}

