package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-11-09 13:58
 */
public class Questions740 {

    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int [] dp=new int [max+1];
        for(int i:nums){
            dp[i]+=i;
        }

        int pre=dp[0];
        int suf=Math.max(dp[0],dp[1]);
        for(int i=2;i<dp.length;i++){
            int temp=suf;
            suf=Math.max(pre+dp[i],temp);
            pre=temp;
        }
        return suf;
    }
}
