package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-02 10:05
 * 90. 子集 II
 */
public class Questions90 {

    public static List<List<Integer>> res=new ArrayList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        order(nums,0,new ArrayList<>());
        return res;
    }

    public static void order(int [] nums,int start,List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            order(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
