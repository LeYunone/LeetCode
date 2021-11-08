package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-08 10:38
 * 299. 猜数字游戏
 */
public class Questions299 {

    public static void main(String[] args) {
        getHint("1123","0111");
    }

    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int[] cntS = new int[10];
        int[] cntG = new int[10];
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bulls;
            } else {
                ++cntS[secret.charAt(i) - '0'];
                ++cntG[guess.charAt(i) - '0'];
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; ++i) {
            cows += Math.min(cntS[i], cntG[i]);
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}
