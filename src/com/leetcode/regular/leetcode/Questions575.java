package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-01 16:53
 */
public class Questions575 {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i:candyType){
            set.add(i);
            count++;
        }
        if(count<candyType.length/2){
            return count;
        }
        return count==candyType.length/2?count:candyType.length/2;
    }
}
