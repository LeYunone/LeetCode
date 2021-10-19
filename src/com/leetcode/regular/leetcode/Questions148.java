package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-10-14 14:14
 * 148. 排序链表
 */
public class Questions148 {

    public ListNode sortList(ListNode head) {
        Queue<ListNode> queue=new LinkedList<>();
        Queue<ListNode> temp=new LinkedList<>();
        ListNode node=head;
        while(node!=null){
            while(!queue.isEmpty() && queue.peek().val>node.val){

            }
            queue.add(node);

        }
        return null;
    }
}
