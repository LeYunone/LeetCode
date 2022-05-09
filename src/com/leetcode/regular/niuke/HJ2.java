package com.leetcode.regular.niuke;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-09
 */
public class HJ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr = sc.nextLine();
        String be = sc.next();

        sr = sr.toUpperCase();
        be = be.toUpperCase();
        char[] chars = sr.toCharArray();
        int count = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == be.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
