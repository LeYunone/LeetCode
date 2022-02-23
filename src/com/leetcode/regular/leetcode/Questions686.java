package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-12-22 09:23
 *
 * 686. 重复叠加字符串匹配
 */
public class Questions686 {

    public static void main (String[] args) {
    }

    public static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (sb.length() < b.length() && ++ans > 0) {
            sb.append(a);
        }
        sb.append(a);
        int idx = sb.indexOf(b);
        if (idx == -1) {
            return -1;
        }
        return idx + b.length() > a.length() * ans ? ans + 1 : ans;
    }
}
