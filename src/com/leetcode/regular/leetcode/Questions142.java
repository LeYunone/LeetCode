package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-10-14 13:43
 *142. 环形链表 II
 */
public class Questions142 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(slow.next==null || fast.next.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
