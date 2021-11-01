package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-29 16:41
 */
public class Questions46 {

    public static List<List<Integer>> result=new ArrayList<>();

    public static void main(String[] args) {
        permute(new int [] {1,2,3});
        System.out.println();
    }

    public static List<List<Integer>> permute(int[] nums) {
        backOrder(new ArrayList<>(),nums,0);
        return result;
    }

    public static void backOrder (List<Integer> temp,int [] nums,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backOrder(temp,nums,index+1);
            temp.remove(index);
        }
    }


}
