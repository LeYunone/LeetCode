package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-13
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * <p>
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Questions86 {

    public ListNode partition(ListNode head, int x) {
        ListNode leftNode = new ListNode(0);
        ListNode lNode = leftNode;
        ListNode rightNode = new ListNode(0);
        ListNode rNode = rightNode;
        while (head != null) {
            if (head.val < x) {
                leftNode.next = head;
                leftNode = leftNode.next;
            } else {
                rightNode.next = head;
                rightNode = rightNode.next;
            }
            head = head.next;
        }
        rightNode.next = null;
        leftNode.next = rNode.next;
        return lNode.next;
    }
}
