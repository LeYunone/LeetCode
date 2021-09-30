package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-30 09:04
 * 344. 反转字符串
 */
public class Questions344 {

    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
