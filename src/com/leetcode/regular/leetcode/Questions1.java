package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-10-09 15:41
 * 1. 两数之和
 */
public class Questions1 {

    public static void main(String[] args) {
        int [] ar={2,7,11,15};
        twoSum(ar,9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int [] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int temp=target-nums[i];
            int left=i;
            int right=nums.length-1;
            while(left<=right){
                int mid=(right-left)/2+left;
                if(nums[mid]==temp){
                    result[0]=i;
                    result[1]=mid;
                    return result;
                }
                if(nums[mid]>temp){
                    right=mid-1;
                }
                if(nums[mid]<temp){
                    left=mid+1;
                }
            }
        }
        return result;
    }
}
