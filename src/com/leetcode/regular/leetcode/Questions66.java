package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-23 13:55
 * 66.加一
 */
public class Questions66 {

    public static void main(String[] args) {
        int ar [] ={1,5,9,9};
        plusOne(ar);
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]=digits[i]+1;
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
