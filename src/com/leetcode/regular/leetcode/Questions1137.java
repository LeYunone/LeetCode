package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-04 14:46
 */
public class Questions1137 {

    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        for(int i=4;i<=n;i++){
            int temp=a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return c;
    }
}
