package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-24 11:06
 *
 * 83. 删除排序链表中的重复元素
 */
public class Questions83 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode2=new ListNode(1);
        ListNode listNode3=new ListNode(1);

        listNode.next=listNode2;
        listNode2.next=listNode3;

        deleteDuplicates(listNode);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;
    }
}
