package com.leetcode.regular.pt;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 * 集五福
 */
public class Questions6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(",");
        int [] arr = new int[5];
        for(String str:split){
            char[] chars = str.toCharArray();
            for(int i =0;i<chars.length;i++){
                arr[i]+=chars[i]-'0';
            }
        }
        int count = 0;
        while(true){
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    break;
                }
                sum+=1;
                arr[i]-=1;
            }
            if(sum==5){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
