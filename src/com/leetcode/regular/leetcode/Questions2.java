package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-30 16:21
 */
public class Questions2 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(2);
        ListNode listNode2=new ListNode(4);
//        ListNode listNode3=new ListNode(3);

        listNode.next=listNode2;

        ListNode listNode4=new ListNode(5);
        ListNode listNode5=new ListNode(6);
        ListNode listNode6=new ListNode(4);

        listNode4.next=listNode5;
        listNode5.next=listNode6;
        addTwoNumbers(listNode,listNode4);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode node=new ListNode(-1);
        ListNode temp=node;
        int count=0;
        while(p1!=null || p2!=null || count>0){
            int sum=(p1==null?0:p1.val)+(p2==null?0:p2.val)+count;
            count=sum/10;
            temp.next=new ListNode(sum%10);
            p1=p1==null?null:p1.next;
            p2=p2==null?null:p2.next;
            temp=temp.next;
        }
        return node.next;
    }
}
