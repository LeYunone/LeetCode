package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-12 09:25
 * 29. 两数相除
 */
public class Questions29 {

    public static void main(String[] args) {
        divide(7,-3);
    }

    public static int divide(int dividend, int divisor) {
        int result=1;
        boolean is=true;
        if(divisor<0 || dividend<0){
            divisor=-divisor;
            is=false;
        }
        while(true){
            int temp=dividend-divisor;
            if(temp>divisor){
                dividend-=divisor;
                result++;
            }else{
                if(!is){
                    result=-result;
                }
                return result;
            }
        }
    }
}
