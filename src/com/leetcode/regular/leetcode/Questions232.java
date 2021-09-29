package com.leetcode.regular.leetcode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-29 13:59
 */
public class Questions232 {

    class MyQueue {
        private Stack stack;
        private Stack temp;
        public MyQueue() {
            stack=new Stack();
            temp=new Stack();
        }

        public void push(int x) {
            while(!stack.isEmpty()){
                temp.push(stack.pop());
            }
            stack.push(x);
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
        }

        public int pop() {
            return (int)stack.pop();
        }

        public int peek() {
            return (int)stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
