package com.leetcode.regular.pt;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class Questions8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num/2;
        int a = 0;
        int b = 0;

        for (int i = 3; i < temp; i += 2) {
            a = i;
            if (a==3 || a % 2 != 0 || a % 3 != 0){
                //一定是素数
                if(num%a==0){
                    b = num/a;
                    if (b==3 || b % 2 != 0 || b % 3 != 0){
                        System.out.println(a+","+b);
                        break;
                    }
                }
            }
        }
    }
}
