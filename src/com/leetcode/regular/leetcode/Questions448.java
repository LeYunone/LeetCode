package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-15 14:11
 * 448. 找到所有数组中消失的数字
 */
public class Questions448 {

    public static void main(String[] args) {
        findDisappearedNumbers(new int []{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
