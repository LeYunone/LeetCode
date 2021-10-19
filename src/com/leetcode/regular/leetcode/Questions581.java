package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-14 09:47
 * 581. 最短无序连续子数组
 */
public class Questions581 {

    public static void main(String[] args) {
        findUnsortedSubarray(new int []{1,2,3,3,3});
    }

    public static int findUnsortedSubarray(int[] nums) {

        int right=nums.length-1;
        int left=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(right>=0){
            if(nums[right]<max){
                max=nums[right];
                right--;
            }else{
              break;
            }
        }
        while(left<nums.length-1){
            if(nums[left]>min){
                min=nums[left];
                left++;
            }else{
                break;
            }
        }
        if(right==-1 || right==left){
            return 0;
        }
        return (right+1)-(left-1)+1;
    }

}
