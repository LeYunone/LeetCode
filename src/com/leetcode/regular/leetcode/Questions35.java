package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-23 09:56
 * 35. 搜索插入位置
 */
public class Questions35 {
    public static void main(String[] args) {
        int [] ar={1,3,5,6};
        searchInsert(ar,2);
    }
    public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int result=0;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(nums[mid]>=target){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
}
