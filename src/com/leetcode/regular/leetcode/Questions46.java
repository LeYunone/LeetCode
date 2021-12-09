package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-29 16:41
 */
public class Questions46 {


    public static void main(String[] args) {
        permute(new int [] {1,2,3});
        System.out.println();
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
        backOrder(res,list,0);
        return res;
    }

    public static void backOrder(List<List<Integer>> res,List<Integer> list,int index){
        if(index==list.size()-1){
            res.add(new ArrayList<>(list));
        }
        for(int i=index;i<list.size();i++){
            Collections.swap(list,i,index);
            backOrder(res,list,index+1);
            Collections.swap(list,i,index);
        }
    }




}
