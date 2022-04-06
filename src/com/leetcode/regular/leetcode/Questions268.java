package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-29 16:27
 * 268. 丢失的数字
 */
public class Questions268 {

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int [] ar=new int[n+1];
        for(int i:nums){
            if(i>=0 && i<=n){
                ar[i]=1;
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                return i+1;
            }
        }
        return 0;   
    }
}
