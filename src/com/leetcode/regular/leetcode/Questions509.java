package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-04 14:32
 */
public class Questions509 {

    public int fib(int n) {
        if(n<=2){
            return n==0?0:1;
        }
        int a=1;
        int b=1;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
