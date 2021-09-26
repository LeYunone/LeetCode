package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pengli
 * @create 2021-09-26 17:13
 * 160. 相交链表
 */
public class Questions160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode top=headA;
        ListNode bottom=headB;
        while(top!=bottom){
            top=top==null?headB:top.next;
            bottom=bottom==null?headA:bottom.next;
        }
        return top;
    }
}
