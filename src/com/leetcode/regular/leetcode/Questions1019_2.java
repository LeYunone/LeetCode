package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-13
 */
public class Questions1019_2 {

    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.val=2;
        ListNode node2 = new ListNode();
        node2.val=1;
        ListNode node3 = new ListNode();
        node3.val = 5;
        node.next=node2;
        node2.next=node3;

        nextLargerNodes(node);
    }

    public static int[] nextLargerNodes(ListNode head) {
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();
        while(node!=null){
            stack.push(node.val);
            node = node.next;
        }
        int [] arr = new int[stack.size()];
        int index = arr.length-1;
        Stack<Integer> ddStack = new Stack<>();
        while(!stack.isEmpty()){
            int v = stack.pop();
            while(!ddStack.isEmpty() && v>=ddStack.peek()){
                ddStack.pop();
            }
            arr[index--] = ddStack.isEmpty()? 0:ddStack.peek();
            ddStack.push(v);
        }
        return arr;
    }
}
