package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-11-09 10:13
 */
public class Questions416 {

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        Arrays.sort(nums);
        int target=sum/2;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            if(temp==target && i!=nums.length-1){
                return true;
            }
            if(temp>target){
                break;
            }
        }
        return false;
    }
}
