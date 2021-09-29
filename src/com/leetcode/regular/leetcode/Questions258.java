package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-29 16:13
 */
public class Questions258 {

    public static void main(String[] args) {
        addDigits(38);
    }

    public static int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num!=0){
                int temp=num%10;
                sum+=temp;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}
