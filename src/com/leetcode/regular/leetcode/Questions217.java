package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-09-28 16:46
 * 217. 存在重复元素
 */
public class Questions217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
