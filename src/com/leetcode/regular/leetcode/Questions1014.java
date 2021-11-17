package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-16 16:01
 */
public class Questions1014 {

    public int maxScoreSightseeingPair(int[] values) {
        int anx=0;
        int maxI=values[0];
        for(int i=1;i<values.length;i++){
            anx=Math.max(anx,maxI+values[i]-i);
            maxI=Math.max(maxI,values[i]+i);
        }
        return anx;
    }
}
