package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-12 09:13
 * 375. 猜数字大小 II
 */
public class Questions375 {

    public static void main(String[] args) {
        getMoneyAmount(6);
    }

    public static int getMoneyAmount(int n) {
        return midOrder(n/2+1,n)+n/2;
    }

    public static int midOrder(int left,int right){
        int sum=0;
        while(left<right){
            int mid = (right-left)/2+left;
            sum+=mid;
            left=mid+1;
        }
        return sum;
    }
}
