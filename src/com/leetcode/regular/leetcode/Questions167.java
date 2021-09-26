package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pengli
 * @date 2021-09-26
 * 167. 两数之和 II - 输入有序数组
 */
public class Questions167 {

    public int[] twoSum(int[] numbers, int target) {
        int []  result=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(true){
            int temp=numbers[left]+numbers[right];
            if(temp>target){
                right--;
            }
            if(temp<target){
                left++;
            }
            if(temp==target){
                result[0]=left+1;
                result[1]=right+1;
                return result;
            }
        }
    }
}
