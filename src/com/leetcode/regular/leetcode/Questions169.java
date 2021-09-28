package com.leetcode.regular.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-09-27 09:36
 * 169. 多数元素
 */
public class Questions169 {

    public static void main(String[] args) {
        int [] ar={6,6,6,6,1,2,3,4,5};
        int i = majorityElement2(ar);

    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                Integer integer = map.get(i);
                if(integer+1>nums.length/2){
                    return i;
                }
                map.put(i,integer+1);
            }else{
                map.put(i,1);
            }
        }
        return 0;
    }

    public static int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
