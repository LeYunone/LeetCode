package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-29
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class Questions24 {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while(node!=null){
            ListNode temp = node.next;
            node.next=temp;
            temp.next = node;
            node = node.next.next;
        }
        return head;
    }
}
