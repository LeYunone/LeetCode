package com.leetcode.regular.niuke;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-09
 */
public class HJ4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        while(count<str.length()){
            int temp = count+8;
            if(temp>=str.length()){
                temp = str.length();
            }
            String substring = str.substring(count, temp);
            if(substring!=null && substring.length()<8){
                while(substring.length()!=8){
                    substring+="0";
                }
            }
            System.out.println(substring);
            count = temp;
        }
    }
}
