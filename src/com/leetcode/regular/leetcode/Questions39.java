package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-29 16:21
 */
public class Questions39 {

    public List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }

    public void backOrder(List<Integer> list,int []candidates, int target,int index){
        if(arraySum(list)==target){
            result.add(list);
            return;
        }
        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            backOrder(list,candidates,target,index);
        }

    }

    public int arraySum(List<Integer> ar){
        int sum=0;
        for(int i:ar){
            sum+=i;
        }
        return sum;
    }
}
