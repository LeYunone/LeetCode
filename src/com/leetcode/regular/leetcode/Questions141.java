package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-26 15:13
141. 环形链表
 */
public class Questions141 {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode pre=head;
        ListNode next=head.next;
        if(next!=pre){
            if(next==null || next.next==null){
                return false;
            }
            pre=pre.next;
            next=next.next.next;
        }
        return true;
    }
}
