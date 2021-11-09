package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-08 14:15
 */
public class Questions438 {

    public static void main(String[] args) {
        findAnagrams("op","by");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int len=s.length();
        int [] pChar=new int [26];
        int [] sChar=new int [26];
        for(Character c:p.toCharArray()){
            pChar[c-'a']++;
        }
        int left=0;
        List<Integer> result=new ArrayList<>();
        for(int right=0;right<s.length();right++){
            int temp=s.charAt(right)-'a';
            sChar[temp]++;
            while(sChar[temp]>pChar[temp]){
                sChar[s.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==p.length()){
                result.add(left);
            }
        }
        return result;
    }
}
