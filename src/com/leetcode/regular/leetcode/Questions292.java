package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-29 17:13
 */
public class Questions292 {
    public boolean canWinNim(int n) {
        if(n==0){
            return true;
        }
        return canWinNim(n-3) || canWinNim(n-2) || canWinNim(n-1);
    }
}
