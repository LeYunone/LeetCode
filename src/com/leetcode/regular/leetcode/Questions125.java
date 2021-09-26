package com.leetcode.regular.leetcode;

import java.util.regex.Matcher;

/**
 * @author pengli
 * @create 2021-09-26 14:17
 *
 * 125. 验证回文串
 */
public class Questions125 {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(right>=left){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
