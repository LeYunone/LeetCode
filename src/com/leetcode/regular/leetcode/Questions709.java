package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-13 08:46
 * 709. 转换成小写字母
 */
public class Questions709 {

    public static void main (String[] args) {
        toLowerCase("Hello");
    }

    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c>=65 && c<=90){
                int temp=chars[i]+32;
                chars[i]=(char)temp;
            }
        }
        return String.valueOf(chars);
    }
}
