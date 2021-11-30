package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-29 14:12
 */
public class Questions383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int [] ar=new int [26];
        for(int i=0;i<magazine.length();i++){
            ar[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            ar[ransomNote.charAt(i)-'a']--;
            if(ar[ransomNote.charAt(i)-'a']==-1){
                return false;
            }
        }
        return true;
    }
}
