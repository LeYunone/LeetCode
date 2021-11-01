package com.leetcode.regular.leetcode;

import java.util.*;

/**
 * @author pengli
 * @create 2021-10-29 17:20
 */
public class Questions387 {

    public int firstUniqChar(String s) {
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.size()==0){
            return -1;
        }
        Character next = set.iterator().next();
        return s.indexOf(next);
    }

}
