package com.leetcode.regular.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 * 在字符串中找出连续最长的数字串
 */
public class Questions3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] line = s.toCharArray();
        List<Integer> data = new ArrayList<>();
        if (isNumber(line[0])) {
            data.add(0);
        }
        for (int i = 1; i < line.length; i++) {
            if (isNumber(line[i]) ^ isNumber(line[i - 1])) {
                data.add(i);
            }
        }
        if (isNumber(line[line.length - 1])) {
            data.add(line.length);
        }

        String max = "";
        for (int i = 0; i < data.size() / 2; i++) {
            Integer start = data.get(i * 2);
            Integer end = data.get(i * 2 + 1);
            if (start != 0) {
                if (line[start - 1] == '+' || line[start - 1] == '-') {
                    start = start - 1;
                }
            }
            if (end < line.length && line[end] == '.' && (i + 1) * 2 < data.size() && data.get((i + 1) * 2) == end + 1) {
                end = data.get((i + 1) * 2 + 1);
            }
            if (max.length() <= end - start) {
                max = s.substring(start, end);
            }
        }
        System.out.println(max);
    }

    private static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}
