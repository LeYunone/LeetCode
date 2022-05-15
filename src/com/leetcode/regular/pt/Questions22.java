package com.leetcode.regular.pt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class Questions22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int index = 0;
        int count = 0;
        while(count!=k-1){
            if(index>0 && chars[index-1] == chars[index]){
                index++;
                continue;
            }
            index++;
            count++;
        }
        System.out.println(str.indexOf(chars[index]));
    }
}
