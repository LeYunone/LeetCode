package com.leetcode.regular.leetcode;

import java.util.*;

/**
 * @author pengli
 * @create 2021-09-30 15:42
 */
public class Questions349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                set2.add(i);
            }
        }
        int [] ar=new int [set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        return ar;
    }
}
