package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-23 11:15
 * 58. 最后一个单词的长度
 */
public class Questions58 {

    public int lengthOfLastWord(String s) {
        int end=s.length()-1;
        while(end>0 && s.charAt(end)==' '){
            end--;
        }
        int start=end;
        while(start>0 && s.charAt(start)!=' '){
            start--;
        }
        return end-start;
    }
}
