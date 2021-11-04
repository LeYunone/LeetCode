package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author pengli
 * @create 2021-11-04 09:02
 */
public class Questions82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(-1,head);
        ListNode node=temp;
        while(node.next!=null && node.next.next!=null){
            if(node.next.val==node.next.next.val){
                int i=node.next.val;
                while(node.next!=null && node.next.val==i){
                    node.next=node.next.next;
                }
            }else{
                node=node.next;
            }
        }
        return temp.next    ;
    }
}
