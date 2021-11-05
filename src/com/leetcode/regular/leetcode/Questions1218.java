package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-11-05 09:03
 * 1218. 最长定差子序列
 */
public class Questions1218 {

    public static void main(String[] args) {
        longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2);
    }

    public static int longestSubsequence(int[] arr, int difference) {

        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i:arr){

            map.put(i,map.getOrDefault(i-difference,0)+1);
            max=Math.max(max,map.get(i));
        }
        return max;
    }

    public static int longestSubsequence2(int[] arr, int difference) {
        int index = 0;
        int end = 1;
        int max = 1;
        while (index <= arr.length - 1) {
            int temp = arr[index];
            int len = 1;
            while (end <= arr.length - 1) {
                if (temp + difference == arr[end]) {
                    len++;
                    temp += difference;
                }
                end++;
            }
            index++;
            end = index + 1;
            max = Math.max(max, len);
        }
        return max;
    }
}
