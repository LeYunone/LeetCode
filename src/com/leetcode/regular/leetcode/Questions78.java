package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-15 09:55
 * 78. 子集
 */
public class Questions78 {

    public static void main(String[] args) {
        subsets(new int []{1,2,3});
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        orderNums(nums,0,result,new ArrayList<>());
        return result;
    }

    public static void orderNums(int [] nums,int index,List<List<Integer>> result,List<Integer> list){

        result.add(new ArrayList<>(list));

        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            orderNums(nums,i+1,result,list);
            list.remove(list.size()-1);
        }
    }
    public void backtrack(int []nums,List<List<Integer>> res,int start,List<Integer> list){
        res.add(new ArrayList<>(list));
        // 遍历后面的元素
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(nums,res,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
