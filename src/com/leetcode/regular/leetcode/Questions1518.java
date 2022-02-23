package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-17 09:10
 * 1518. 换酒问题
 */
public class Questions1518 {

    public static void main (String[] args) {
        numWaterBottles(9,3);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>=numExchange){
            int temp=numBottles/numExchange;
            int i=numBottles%numExchange;
            count+=temp;
            numBottles=temp+i;
        }
        return count;
    }
}
