package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @date 2021-09-29
 * 326. 3的幂
 */
public class Questions326 {

    public boolean isPowerOfThree(int n) {
        while(n!=0 && n%3==0){
            n=n/3;
        }
        return n==1;
    }
}
