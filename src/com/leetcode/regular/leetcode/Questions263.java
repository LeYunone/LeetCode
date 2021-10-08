package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-29 16:20
 * 263. 丑数
 */
public class Questions263 {
    public boolean isUgly(int n) {
        if(n%2==0 || n% 3==0 ||n%5==0){
            if(n/2==3 || n/2==5 || n/3==2 || n/3==5 || n/5==2|| n/5==3){
                return true;
            }
        }
        return false;
    }
}
