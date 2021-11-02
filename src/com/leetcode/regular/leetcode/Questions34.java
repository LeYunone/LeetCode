package com.leetcode.regular.leetcode;

import java.lang.annotation.Target;

/**
 * @author pengli
 * @create 2021-10-11 10:26
 */
public class Questions34 {

    public static void main(String[] args) {
        int [] ar={1};
        Questions34 q=new Questions34();
        q.searchRange(ar,1);
        System.out.println();
    }

    public int[] searchRange(int[] nums, int target) {
        int left=searchMid(nums,0,nums.length-1,target,true);
        int right=searchMid(nums,0,nums.length-1,target,false)-1;
        if(right>=left && nums[left]==target && nums[right] == target && right<nums.length){
            return new int []{left,right};
        }
        return new int [] {-1,-1};
    }

    public int searchMid(int [] nums,int left,int right,int target,boolean is){
        int r=nums.length;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(nums[mid]>target || (is && nums[mid]>=target)){
                right=mid-1;
                r=mid;
            }else{
                left=mid+1;
            }
        }
        return r;
    }
}
