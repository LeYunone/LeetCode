package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-06 09:27
 * 1816. 截断句子
 */
public class Questions1816 {

    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(s1[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
