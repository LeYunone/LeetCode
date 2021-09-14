package com.leetcode.expand;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-14 15:46
 *
 * 逆波兰式  后缀表达式
 */
public class RPN {

    public static void main(String[] args) {
        String s="a+b*c+(d*e+f)*g";
        Stack<Character> result=new Stack();
        Stack<Character> temp=new Stack();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>0 && c<10){
                //如果是数字的话 直接压入结果栈中
                temp.push(c);
            }else{
                if(result.empty()){
                    result.push(c);
                }else{
                    Character peek = result.peek();
                    if(c=='*'|| c=='/'){

                    }
                }
            }
        }
    }
}
