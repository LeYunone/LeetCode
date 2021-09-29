package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-29 14:52
 * 234. 回文链表
 */
public class Questions234 {

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop().val!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
