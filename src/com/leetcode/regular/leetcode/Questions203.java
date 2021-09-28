package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-28 15:29
 * 203. 移除链表元素
 */
public class Questions203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead =new ListNode(-1);
        dummyHead.next=head;
        ListNode temp=dummyHead;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return dummyHead.next;
    }
}
