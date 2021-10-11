package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-11 09:26
 * 441. 排列硬币
 */
public class Questions441 {

    public static void main(String[] args) {
        arrangeCoins(5);
    }

    public static int arrangeCoins(int n) {
        int result=1;
        while(true){
            int temp=n-result;
            if(temp<0){
                return result;
            }
            result++;
            n=temp;
        }
    }
}
