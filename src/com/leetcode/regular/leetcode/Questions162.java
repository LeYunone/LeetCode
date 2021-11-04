package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-11-03 13:25
 */
public class Questions162 {

    public static void main(String[] args) {
        findPeakElement(new int [] {3,4,3,2,1});
    }


    public static int findPeakElement(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        while(right>left){
            int mid=(right-left)>>1+left;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
}
