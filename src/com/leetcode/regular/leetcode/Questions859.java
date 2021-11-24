package com.leetcode.regular.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-11-23 09:28
 */
public class Questions859 {

    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            Set<Character> set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    return true;
                }else{
                    set.add(s.charAt(i));
                }
            }
            return false;
        }else{
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }
}
