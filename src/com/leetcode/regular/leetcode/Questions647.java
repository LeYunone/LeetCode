package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-13 11:04
 * 647. 回文子串
 */
public class Questions647 {

    public static void main(String[] args) {
        Questions647 questions647=new Questions647();
        questions647.countSubstrings("aaa");
    }

    public int countSubstrings(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int sum=orderStr(s,i,i);
            int sum2=orderStr(s,i,i+1);
            result=result+sum2+sum;
        }
        return result;
    }

    public int orderStr(String s,int left,int right){
        //计算当前遍历下标的所有回文串
        int sum=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            sum++;
            left--;
            right++;
        }
        return sum;
    }
}
