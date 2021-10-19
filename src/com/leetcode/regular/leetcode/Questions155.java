package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-26 16:56
 * 155. 最小栈
 */
public class Questions155 {
    class MinStack {

        Stack<Integer> stack=null;
        Stack<Integer> temp=null;
        public MinStack() {
            stack=new Stack<>();
            temp=new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (!temp.isEmpty()) {
                if (temp.peek() > val) {
                    temp.push(val);
                }
            } else {
                temp.push(val);
            }
        }

        public void pop() {
           if(stack.isEmpty()){
               return;
           }else{
               stack.pop();
           }
        }

        public int top() {
            return stack.isEmpty()?0:stack.peek();
        }

        public int getMin() {
            return temp.isEmpty()?0:temp.pop();
        }
    }
}
