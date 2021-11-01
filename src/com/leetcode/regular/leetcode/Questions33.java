package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-29 14:52
 *
 * 33. 搜索旋转排序数组
 */
public class Questions33 {

    public static void main(String[] args) {
        search(new int []{3,1},3);
    }

    public static int search(int[] nums, int target) {
        //找到两边的有序数组
        int left=0;
        int right=nums.length-1;
        int index=0;
        boolean is=false;
        while(left<right && nums[left]>nums[right]){
            is=true;
            int mid=(right-left)/2+left;
            if(nums[mid]>nums[mid+1]){
                index=mid;
                break;
            }else{
                left=mid;
            }
        }
        //判断index下标和目标值大小，选定遍历的数组
        if(nums[index]>target && index!=0){
            //用逆反的数组
            left=index+1;
            while(left<right){
                int mid=(right-left)/2+left;
                if(nums[mid]<target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }else{
            //用正常的数组
            left=0;
            right=is?index:nums.length-1;
            if(right==0){
                right=nums.length-1;
                while(left<right){
                    int mid=(right-left)/2+left;
                    if(nums[mid]<=target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
            }else{
                while(left<right){
                    int mid=(right-left)/2+left;
                    if(nums[mid]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
            }
        }
        if(nums[left]!=target){
            return -1;
        }
        return left;
    }
}
