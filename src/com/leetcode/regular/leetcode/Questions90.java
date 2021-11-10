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

    public static void main(String[] args) {
        subsetsWithDup(new int [] {1,2,2});
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        order(nums,0,new ArrayList<>());
        return res;
    }

    public static void order(int [] nums,int start,List<Integer> list){
        List<Integer> newlist=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            newlist.add(list.get(i));
        }
        res.add(newlist);
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            order(nums,start+1,list);
            list.remove(list.size()-1);
        }
    }
}
