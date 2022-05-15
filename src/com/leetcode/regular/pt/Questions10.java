package com.leetcode.regular.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-14
 * <p>
 * 132、 √数字排列组合
 * 小明负责公司年会，想出一个趣味游戏：
 * 屏幕给出 1～9 中任意 3 个不重复的数字，大家以最快时间给出这几个数字可拼成的数字从
 * 小到大排列位于第 N 位置的数字，其中 N 为给出的数字中最大的（如果不到这么多个数字
 * 则给出最后一个即可）。
 */
public class Questions10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.valueOf(split[i]);
        }
        List<Integer> result = new ArrayList<>();
    }
}
