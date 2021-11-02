package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-29 14:52
 *
 * 33. 搜索旋转排序数组
 */
public class Questions33 {

    public static void main(String[] args) {
        search(new int []{1,3,5},1);
    }

    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(right>=left){
            int mid=(right-left)/2+left;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[0]<=nums[mid]){
                //如果0-mid是升序数组有序的
                if(nums[0]<=target && nums[mid]>=target){
                    //判断目标值是否在 0-mid区间
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<=target && nums[nums.length-1]>target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
