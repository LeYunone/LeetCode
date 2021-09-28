package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-09-28 17:04
 * 219. 存在重复元素 II
 */
public class Questions219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
