package com.leetcode.regular.leetcode;

import sun.java2d.pipe.SpanIterator;

/**
 * @author pengli
 * @create 2021-09-29 11:23
 * 231. 2 的幂
 */
public class Questions231 {

    public static void main(String[] args) {
    }

    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
