package com.leetcode.regular.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 */
public class Questions9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            int i = sc.nextInt();
            list.add(i);
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(Integer num : list){
            index = Math.max(index+num,num);
            max = Math.max(max,index);
        }
        System.out.println(max);
    }
}
