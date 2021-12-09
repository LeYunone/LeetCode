package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-03 10:58
 * 1005. K 次取反后最大化的数组和
 */
public class Questions1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        if(k%2==0){

        }else{

        }
        return sum;
    }
}
