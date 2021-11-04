package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-03 10:17
 */
public class Questions153 {

    public static void main(String[] args) {
        findMin(new int [] {2,1});
    }

    public static int findMin(int[] nums) {
        int len=nums.length-1;
        if(nums[0]<nums[len]){
            return nums[0];
        }
        int left=0;
        int right=len;
        int result=nums[0];
        while(right>=left){
            int mid=(right-left)/2+left;
            if((nums[left]<nums[mid] && nums[left]>nums[right])||nums[mid]>nums[right]){
                //说明0-mid是升序，向后找
                left=mid+1;
            }else{
                //说明 最小值一定在0-mid的区间中
                right=mid-1;
            }
            if(nums[mid]<result){
                result=nums[mid];
            }
        }
        return result;
    }
}
