package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-11 14:24
 * 5. 最长回文子串
 */
public class Questions5 {

    public static void main(String[] args) {
        longestPalindrome("cbbd");
    }

    public static String longestPalindrome(String s) {
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int len=order(s,i,i);
            int len2=order(s,i,i+1);
            len=Math.max(len,len2);
            if(len>max){
                max=len;
                start=(i-len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int order(String str,int left,int right){
        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


}
