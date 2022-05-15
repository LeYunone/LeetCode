package com.leetcode.regular.pt;

import java.util.*;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 *
 * 卡片组成最大数
 */
public class Questions7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(",");
        List<String> list = Arrays.asList(split);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len = Math.min(o1.length(),o2.length());
                for(int i=0;i<len;i++){
                    if(o1.charAt(i) > o2.charAt(i)){
                        return -1;
                    }else if(o1.charAt(i)<o2.charAt(i)){
                        return 1;
                    }
                }
                return 0;
            }
        });
        for(String str:list){
            System.out.print(str);
        }
    }
}
