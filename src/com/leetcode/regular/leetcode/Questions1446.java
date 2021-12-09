package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-01 08:47
 * 1446. 连续字符
 */
public class Questions1446 {

    public int maxPower(String s) {
        int max=1;
        int temp=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                temp++;
                max=Math.max(max,temp);
            }else{
                temp=1;
            }
        }
        return max;
    }
}
