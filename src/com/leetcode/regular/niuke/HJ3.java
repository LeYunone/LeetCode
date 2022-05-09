package com.leetcode.regular.niuke;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-09
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * <p>
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
 */
public class HJ3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.valueOf(in.next());
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i=0;i<count;i++){
            String next = in.next();
            set.add(Integer.valueOf(next));
        }
        for(Integer i :set){
            System.out.println(i);
        }
    }
}
