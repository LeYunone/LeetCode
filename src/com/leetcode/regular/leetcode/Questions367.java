package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-09 09:55
 */
public class Questions367 {

    public static void main(String[] args) {
        isPerfectSquare(808201);
    }

    public static boolean isPerfectSquare(int num) {
        long right=num/2;
        long left=2;
        while(right>=left){
            long mid=(right-left)/2+left;
            long temp=mid*mid;
            if(temp>num){
                right=mid-1;
            }else if(temp<num){
                left=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
