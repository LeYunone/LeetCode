package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-09 15:09
 * 15. 三数之和
 */
public class Questions15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<2){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(true){
            int temp=nums[left]+nums[right];
            int mid=(right-left)/2+left;
            if(mid>-temp){
                
            }
        }
    }
}
