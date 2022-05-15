package com.leetcode.regular.pt;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class Questions11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int [num];
        for(int i=1;i<=num;i++){
            arr[i] = sc.nextInt();
        }

        int [] dp = new int [num];
        dp[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            dp[i] = Math.max(dp[i-1]-1,arr[i]);

            if(dp[i]==0 && i!=arr.length-1){
            }
        }
    }
}
