package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-08 10:17
 * 598. 范围求和 II
 */
public class Questions598 {

    public int maxCount(int m, int n, int[][] ops) {
        int minx=m;
        int miny=n;
        for(int [] ar:ops){
            minx=Math.min(minx,ar[0]);
            miny= Math.min(miny,ar[1]);
        }
        return minx*miny;
    }
}
