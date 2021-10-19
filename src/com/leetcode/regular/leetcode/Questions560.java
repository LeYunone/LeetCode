package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-10-14 13:28
 */
public class Questions560 {

    public int subarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<=k){
                if(set.contains(k-nums[i])){
                    count++;
                }
            }
        }
        return 0;
    }
}
