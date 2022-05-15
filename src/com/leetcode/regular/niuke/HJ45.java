package com.leetcode.regular.niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class HJ45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            String next = scanner.next();
            char count [] = new char[26];
            for(char c : next.toCharArray()){
                count[c-'a']++;
            }
            int sum = 0;
            int temp = 26;
            Arrays.sort(count);
            for(int j = count.length-1;j>=0;j--){
                sum += count[j]*temp;
                temp--;
            }
            System.out.println(sum);
        }
    }
}
