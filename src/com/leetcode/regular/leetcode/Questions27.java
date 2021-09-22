package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-22 17:02
 * 27.移除元素
 */
public class Questions27 {

    public static void main(String[] args) {
        int ar[]={3,2,2,3};
        removeElement(ar,3);
    }
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
