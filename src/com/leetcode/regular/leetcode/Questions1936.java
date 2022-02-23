package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-15 09:43
 * 1936. 新增的最少台阶数
 */
public class Questions1936 {

    public static void main (String[] args) {
        addRungs(new int [] {1,3,5,10},2);
    }

    public static int addRungs(int[] rungs, int dist) {
        int now=0;
        int count=0;
        for(int h:rungs){
            if(now+dist<h){
                int temp=h-now-1;
                count+=temp/dist;
            }
            now=h;
        }
        return count;
    }
}
