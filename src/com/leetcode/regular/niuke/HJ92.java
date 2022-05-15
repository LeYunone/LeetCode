package com.leetcode.regular.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class HJ92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.next();
            char[] chars = next.toCharArray();
            int len = 0;
            int max = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if (isNum(chars[i])) {
                    len++;
                }else{
                    if(len >= max){
                        String substring = next.substring(i-len,i);
                        list.add(substring);
                        max = len;
                    }
                    len = 0;
                }
                if(i==chars.length-1 && len!=0){
                    if(len >= max){
                        String substring = next.substring(i-len+1);
                        list.add(substring);
                        max = len;
                    }
                }
            }
            for(int i =0;i<list.size();i++){
                String s = list.get(i);
                if(s.length()==max){
                    System.out.print(s);
                }
            }
            System.out.print(max+"\n");
        }
    }

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }
}
