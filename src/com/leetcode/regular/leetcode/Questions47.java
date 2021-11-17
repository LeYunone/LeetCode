package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author pengli
 * @create 2021-11-11 09:06
 * 47. 全排列 II
 */
public class Questions47 {

    public static void main(String[] args) {
        permuteUnique(new int []{1,1,2});
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean [] trues=new boolean [nums.length];
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        order(res,trues,nums,new ArrayList<>(),0);
        return res;
    }

    public static void order(List<List<Integer>> res,boolean [] trues,int [] nums,List<Integer> list,int start){
        if(start==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(trues[i] || (i>0 && nums[i] ==nums[i-1] && !trues[i-1])){
                continue;
            }
            list.add(nums[i]);
            trues[i]=true;
            order(res,trues,nums,list,start+1);
            list.remove(list.size()-1);
            trues[i]=false;
        }
    }
}
