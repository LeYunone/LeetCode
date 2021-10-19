package com.leetcode.regular.leetcode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-10-13 10:56
 * 32. 最长有效括号
 */
public class Questions32 {
    public int longestValidParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> tempStack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){

        }
        return 0;
    }

}
