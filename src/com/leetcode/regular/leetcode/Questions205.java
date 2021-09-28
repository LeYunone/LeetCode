package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-09-28 15:54
 * 205. 同构字符串
 */
public class Questions205 {

    public static void main(String[] args) {
        isIsomorphic2("eggbb","abbbb");
    }
    public static boolean isIsomorphic2(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] preIndexOfs = new int[256];
        int[] preIndexOft = new int[256];
        for (int i = 0; i < chars.length; i++) {
            if (preIndexOfs[chars[i]] != preIndexOft[chart[i]]) {
                return false;
            }
            preIndexOfs[chars[i]] = i + 1;
            preIndexOft[chart[i]] = i + 1;
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> maps= new HashMap<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(maps.containsKey(c)){
                sb.append(maps.get(c));
            }else{
                sb.append(i+",");
                maps.put(c,i);
            }
        }

        Map<Character,Integer> maps2= new HashMap<>();
        StringBuffer sb2=new StringBuffer();
        for(int i=0;i<t.length();i++){
            Character c=t.charAt(i);
            if(maps2.containsKey(c)){
                sb2.append(maps2.get(c));
            }else{
                sb2.append(i+",");
                maps2.put(c,i);
            }
        }
        return sb.toString().equals(sb2.toString());
    }
}
