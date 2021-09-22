package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-09-22 15:10
 *
 * 11. 罗马数字转整数
 */
public class Questions11 {


    public static void main(String[] args) {
        romanToInt("IX");
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char d=s.charAt(s.length()-1);
        int sum=map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i+1))>map.get(s.charAt(i))){
                sum-=map.get(s.charAt(i));
            }else{
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
