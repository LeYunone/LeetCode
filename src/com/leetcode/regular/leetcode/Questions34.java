package com.leetcode.regular.leetcode;

import java.lang.annotation.Target;

/**
 * @author pengli
 * @create 2021-10-11 10:26
 */
public class Questions34 {

    public static void main(String[] args) {
        int [] ar={5,7,7,8,8,10};
        searchRange(ar,8);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int left2=0;
        int right2=nums.length-1;
        int leftTemp=target-1;
        int rightTemp=target+1;
        while(right> left || right2>left2){
            if(right>left){
                //找左边
                int mid=(right-left)/2+left;
                if(nums[mid]>leftTemp){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            if(right2>left2){
                //找右边
                int mid=(right2-left2)/2+left2;
                if(nums[mid]>rightTemp){
                    right2=mid-1;
                }else{
                    left2=mid+1;
                }
            }
        }
        if(nums[left+1]!=target){
            return new int [] {-1,-1};
        }
        return new int [] {left,left2-1};
    }


    public int searchMid(int []nums, int tar,boolean is){
        int left=0;
        int right=nums.length-1;
        int result=0;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(nums[mid]>tar ||(is && nums[mid]==tar)){
                right=mid-1;
                result=mid;
            }else{
                left=mid+1;
            }
        }
        return result;
    }



    public static int[] searchRange2(int[] nums, int target) {
        int [] result=new int [2];
        if(nums.length==0){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(end-start)/2+start;
            if(nums[mid]>target){
                end=mid-1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            if(nums[mid]==target){
                end=mid;
                start=mid;
                break;
            }
        }
        if(nums[start]!=target){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        while(start>0 && end<=nums.length-1 && (nums[start]==target || nums[end] == target)){
            if(nums[start]==target){
                start--;
            }
            if(nums[end]==target){
                end++;
            }
        }
        if(end==start){
            result[0]=start+1;
            result[1]=-1;
        }else{
            result[0]=start+1;
            result[1]=end-1;
        }
        return  result;
    }
}
