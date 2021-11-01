package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-28 08:55
 * 1668. 最大重复子字符串
 */
public class Questions1668 {

    public static void main(String[] args) {
        maxRepeating("ababc","ab");
    }

    public static int maxRepeating(String sequence, String word) {
        String temp=word;
        int count=0;
        boolean is=true;
        while(is){
            if(!sequence.contains(word)){
                is=false;
            }else{
                count++;
            }
            word=word+temp;
        }
        return count;
    }
}
