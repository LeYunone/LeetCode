package com.leetcode.regular.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-10-09 15:41
 * 1. 两数之和
 */
public class Questions1 {

    public static void main(String[] args) {
        int [] ar={2,7,11,15};
        twoSum(ar,9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int []{i,map.get(target-i)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
