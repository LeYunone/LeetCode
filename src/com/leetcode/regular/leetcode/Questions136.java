package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-26 14:39
 * 136. 只出现一次的数字
 */
public class Questions136 {

    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}
