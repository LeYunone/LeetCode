package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-22 14:36
 * 9.回文数
 */
public class Questions9 {

    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int re=0;
        while(re>x){
            re=re*10+x%10;
            x/=10;
        }
        return x==re || x==re/10;
    }
}
