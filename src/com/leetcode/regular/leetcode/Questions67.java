package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-24 09:30
 *  67. 二进制求和
 */
public class Questions67 {

    public static void main(String[] args) {
        addBinary("11","1");
    }

    public static String addBinary(String a, String b) {
        for(int i=a.length();i<b.length();i++){
            a="0"+a;
        }
        for(int i=b.length();i<a.length();i++){
            b="0"+b;
        }
        String result="";
        String temp="0";
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                result=temp+result;
                temp="1";
            }else{
                if(temp.equals("1")){
                    if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                        result=temp+result;
                        temp="0";
                    }else{
                        if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                            result=temp+result;
                            temp="1";
                        }else{
                            result="0"+result;
                            temp="1";
                        }
                    }
                }else{
                    if(a.charAt(i)=='1' || b.charAt(i)=='1'){
                        result="1"+result;
                    }else{
                        result="0"+result;
                    }
                }
            }
        }
        if(temp.equals("1")){
            result=temp+result;
        }
        return result;
    }
}
