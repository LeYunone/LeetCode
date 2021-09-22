package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-09-15 09:51
 * 21. 合并两个有序链表
 */
public class Questions21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                temp.next=l2;
                l2=l2.next;
            }else {
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        temp.next= l1==null? l2: l1;
        return result.next;
    }
}
