package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pengli
 * @create 2021-11-11 11:01
 * 40. 组合总和 II
 */
public class Questions40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        order(res,candidates,new ArrayList<>(),target,0);
        return res;
    }

    public void order(List<List<Integer>> res,int [] nums,List<Integer> list,int target,int index){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            order(res,nums,list,target-nums[i],i+1);
            list.remove(list.size()-1);
        }
    }
}
