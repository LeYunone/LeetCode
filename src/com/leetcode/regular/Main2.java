package com.leetcode.regular;

import java.util.*;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-15
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(",");
        List<String> list = new ArrayList<>();

        for (String str : split) {
            list.add(str);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int minLen = Math.min(o1.length(), o2.length());
                if(o1.length()>o2.length() && o1.charAt(0) >o2.charAt(0))
                for (int i = 0; i < minLen; i++) {
                    if(o1.charAt(i)>o2.charAt(i)){
                        return 1;
                    }
                    if(o1.charAt(i)<o2.charAt(i)){
                        return -1;
                    }
                }
                return 0;
            }
        });
        int temp =list.size()>=3? 3:split.length;
        for(int i=0;i<temp;i++){
            System.out.print(list.get(i));
        }
    }
}
