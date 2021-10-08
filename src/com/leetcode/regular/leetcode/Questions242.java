package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-29 15:38
 */
public class Questions242 {

    public static void main(String[] args) {
        isAnagram("rat","car");
    }

    // "anagram" "nagaram"
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int ar[]=new int[255];
        int ar2[]=new int[255];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)]+=1;
            ar2[t.charAt(i)]+=1;
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=ar2[i]){
                return false;
            }
        }
        return true;
    }
}
