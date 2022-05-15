package com.leetcode.regular;

import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class Main {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int count = 1; count <= num; count++) {
            String next = in.next();

            //加密
            char[] chars = next.toCharArray();
            //计算加密数组
            int [] arr = new int[chars.length];
            for(int i=0;i<arr.length;i++){
                if(i==0){
                    arr[i] = 1;
                    continue;
                }
                if(i==1){
                    arr[i] = 2;
                    continue;
                }
                if(i==2){
                    arr[i] = 4;
                    continue;
                }
                arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
            }
            for (int i = 0; i < chars.length; i++) {
                char c=chars[i];
                int pos=arr[i];
                int v = c+pos;
                if(v>'z'){
                    v = v-26*i;
                }
                chars[i] =(char)v;
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
