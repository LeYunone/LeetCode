package com.leetcode.regular.leetcode;

import sun.security.util.Length;

/**
 * @author pengli
 * @create 2021-11-09 13:16
 * 213. 打家劫舍 II
 */
public class Questions213 {

    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(order(nums,0,len-2),order(nums,1,len-1));
    }

    public int order(int [] nums,int start,int end){
        int pre=nums[start];
        int suf=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<end;i++){
            int temp=suf;
            suf=Math.max(pre+nums[i],temp);
            pre=temp;
        }
        return suf;
    }
}
