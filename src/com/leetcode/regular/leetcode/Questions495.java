package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-10 09:11
 * 495. 提莫攻击
 */
public class Questions495 {

    public static void main(String[] args) {
        findPoisonedDuration(new int [] {1,2},2);
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int index=timeSeries[0]+duration-1;
        int sum=0;
        for(int i=1;i<timeSeries.length;i++){
            if(index>=timeSeries[i]){
                sum+=timeSeries[i]-timeSeries[i-1];
            }else{
                sum+=duration;
            }
            index=timeSeries[i]+duration-1;
        }
        return sum+duration;
    }
}
