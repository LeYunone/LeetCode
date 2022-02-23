package com.leetcode.regular.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-10-14 13:28
 */
public class Questions560 {

    public static int count=0;

    public static void main (String[] args) {
        subarraySum(new int [] {1,1,1},2);
    }

    public static int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        order(nums,0,k,0);
        return count;
    }

    public static void order(int [] arr,int sum,int k,int index){
        if(sum>k){
            return;
        }
        if(sum==k){
            count++;
        }
        for(int i=index;i<arr.length;i++){
            order(arr,arr[i]+sum,k,i+1);
        }
    }
}
