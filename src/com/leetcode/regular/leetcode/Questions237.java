package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-29 15:27
 * 237. 删除链表中的节点
 */
public class Questions237 {

    private ListNode head;

    public void deleteNode(ListNode node) {
        ListNode temp=new ListNode(-1);
        temp.next=head;
        while(temp!=null){
            if(temp.next==node){
                temp.next=node.next;
                break;
            }
            temp=temp.next;
        }
    }
}
