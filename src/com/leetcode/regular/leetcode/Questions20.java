package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-14 14:19
 *
 * 20. 有效的括号
 */
public class Questions20 {

    public static void main(String[] args) {
        isValid("[[[]");
    }

    public static boolean isValid(String s) {
        if(s.length()==2){
            return s.equals("()")||s.equals("{}")||s.equals("[]");
        }
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(null==map.get(c)){
                stack.push(c);
            }else{
                if(stack.empty() || stack.pop().charValue()!=map.get(c)){
                   return false;
                }
            }
        }
        return stack.empty();
    }
}
