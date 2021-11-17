package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-29 16:21
 */
public class Questions39 {


    public static void main(String[] args) {
        Questions39 questions39=new Questions39();
        questions39.combinationSum(new int [] {2,3,6,7},7);
    }

    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backOrder(res,new ArrayList<>(),candidates,target,0);
        return res;
    }

    public  void backOrder(List<List<Integer>> result,List<Integer> list,int []candidates, int target,int index){
        if(arraySum(list)>target){
            return;
        }
        if(arraySum(list)==target){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            backOrder(result,list,candidates,target,i);
            list.remove(list.size()-1);
        }

    }

    public  int arraySum(List<Integer> ar){
        int sum=0;
        for(int i:ar){
            sum+=i;
        }
        return sum;
    }
}
