package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-27 15:01
 * 202. 快乐数
 */
public class Questions202 {

    public static void main(String[] args) {
    }

    public  boolean isHappy(int n) {
        int pre=n;
        int next=nextHappy(n);
        while(n!=1 && pre!=next){
            pre=nextHappy(pre);
            next=nextHappy(nextHappy(next));
        }
        return n==1;
    }

    public int nextHappy(int n){
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;
        }
        return sum;
    }
}
