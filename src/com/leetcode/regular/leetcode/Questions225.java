package com.leetcode.regular.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-09-28 17:13
 */
public class Questions225 {

    class MyStack {

        private Queue queue;
        private Queue temp;

        public MyStack() {
            queue=new LinkedList();
            temp=new LinkedList();
        }

        public void push(int x) {
            temp.offer(x);
            while(!queue.isEmpty()){
                temp.offer(queue.poll());
            }
            Queue q=queue;
            queue=temp;
            temp=q;
        }

        public int pop() {
            return (int)queue.poll();
        }

        public int top() {
            return (int)queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
