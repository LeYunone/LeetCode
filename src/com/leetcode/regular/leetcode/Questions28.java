package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-23 09:14
 *
 * 28.  实现strStr()
 */
public class Questions28 {

    public static void main(String[] args) {
        strStr("aaa","aaaa");
    }

    public static int strStr(String haystack, String needle) {
        if("".equals(haystack) && "".equals(needle)){
            return 0;
        }
        int result=0;
        int left=0;
        int left2=0;
        while(left<haystack.length() && left2<needle.length()){
            if(needle.charAt(left2)==haystack.charAt(left)){
                left2++;
                result=left;
            }else{
                result=-1;
            }
            left++;
        }
        return result-left2;
    }
}
