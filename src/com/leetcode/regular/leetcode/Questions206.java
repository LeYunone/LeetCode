package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-28 16:32
 */
public class Questions206 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);

        listNode.next=listNode2;
        listNode2.next=listNode3;
        reverseList(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        while(!stack.isEmpty()){
            ListNode pop = stack.pop();
            if(stack.isEmpty()){
                pop.next=null;
            }
            temp.next=pop;
            temp=temp.next;
        }
        return result.next;
    }
}
