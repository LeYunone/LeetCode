package com.leetcode.regular.leetcode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-10-12 10:11
 * 10. 正则表达式匹配
 */
public class Questions10 {

    public static void main(String[] args) {
        isMatch("ab",
                ".*");
    }

    public static boolean isMatch(String s, String p) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        Stack<Character> patten=new Stack<>();
        for(int i=0;i<p.length();i++){
            patten.push(p.charAt(i));
        }
        while(!stack.isEmpty()&&!patten.isEmpty()){
            Character pop = patten.pop();
            Character str = stack.pop();
            if(pop=='*'){
                Character pre = patten.pop();
                if(pre.charValue()=='.'){
                    while(!stack.isEmpty()){
                        stack.pop();
                    }
                }else if(str.charValue()==pre.charValue()){
                    while(!stack.isEmpty()&&stack.peek().charValue()==pre.charValue()){
                        stack.pop();
                    }
                }else{
                    stack.push(str);
                }
            }else if(pop=='.'){

            }else{
                if(pop.charValue()!=str.charValue()){
                   break;
                }
            }
        }
        if(!patten.isEmpty()){
            while(!patten.isEmpty()){
                Character pop = patten.pop();
                if(pop.charValue()=='*'){
                    patten.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty() && patten.isEmpty();
    }
}
