package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-05 10:14
 * 844. 比较含退格的字符串
 */
public class Questions844 {

    public static void main(String[] args) {
        backspaceCompare("ab#c","ad#c");
    }

    public static boolean backspaceCompare(String s, String t) {
        int scount=s.length()-1;
        int tcount=t.length()-1;
        while(scount>=0 && tcount>=0){
            while(s.charAt(scount)=='#'){
                scount-=2;
            }
            while(t.charAt(tcount)=='#'){
                tcount-=2;
            }
            if(s.charAt(scount)!=t.charAt(tcount)){
                return false;
            }
            scount--;
            tcount--;
        }
        int temp=0;
        while(scount>=0){
            if(s.charAt(scount)=='#'){
                temp++;
                scount--;
            }
            scount-=temp;
            temp=0;
        }
        while(tcount>=0){
            if(t.charAt(tcount)=='#'){
                temp++;
                tcount--;
            }
            tcount-=temp;
            temp=0;
        }
        return scount<=-1&&tcount<=-1?true:false;
    }
}
