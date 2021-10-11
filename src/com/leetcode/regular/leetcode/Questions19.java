package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author pengli
 * @create 2021-10-11 09:45
 * 19. 删除链表的倒数第 N 个结点
 */
public class Questions19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result=new ListNode(-1);
        result.next=head;
        ListNode node=result;
        int count=0;
        while(node!=null){
            if(count==n-1){
                if(node.next.next!=null){
                    node.next=node.next.next;
                }else{
                    node.next=null;
                }
            }
            count++;
            node=node.next;
        }
        return result.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        Stack<ListNode> stack=new Stack<>();
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        while(n>0){
            stack.pop();
            n--;
        }
        if(stack.isEmpty()){
            //删除表头元素
            head=head.next;
            return head;
        }
        ListNode pop = stack.pop();
        if(pop.next.next!=null){
            pop.next=pop.next.next;
        }else{
            pop.next=null;
        }
        return head;
    }


    public ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode node=new ListNode(0,head);
        ListNode pre=node;
        ListNode next=head;
        for(int i=0;i<n;i++){
            next=next.next;
        }
        while(next!=null){
            next=next.next;
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return node.next;
    }
}
