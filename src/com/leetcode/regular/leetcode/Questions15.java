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

    public static void main(String[] args) {
        threeSum(new int []{-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<2){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int right=nums.length-1;
            int tar=-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j] ==nums[j-1]){
                    continue;
                }
                while(j<right && nums[j]+nums[right]>tar){
                    right--;
                }
                if(j==right){
                    break;
                }
                if(nums[j]+nums[right]==tar){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[right]);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
