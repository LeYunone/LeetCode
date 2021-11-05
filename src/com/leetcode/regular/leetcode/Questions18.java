package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pengli
 * @create 2021-11-05 15:43
 */
public class Questions18 {

    public static void main(String[] args) {
        fourSum(new int []{1, 0, -1, 0, -2, 2
        },0);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=0;i<nums.length-3;i++){
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }

            for(int j=i+1;j<nums.length-2;j++){
                if(j>=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int right=nums.length-1;
                int left=j+1;
                while(right>left){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }

                }
            }
        }
        return result;
    }
}
