package com.leetcode.regular.leetcode;

import com.leetcode.bean.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-12
 *
 * 给定一个长度为 n 的链表 head
 *
 * 对于列表中的每个节点，查找下一个 更大节点 的值。也就是说，对于每个节点，找到它旁边的第一个节点的值，这个节点的值 严格大于 它的值。
 *
 * 返回一个整数数组 answer ，其中 answer[i] 是第 i 个节点( 从1开始 )的下一个更大的节点的值。如果第 i 个节点没有下一个更大的节点，设置 answer[i] = 0 。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/next-greater-node-in-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Questions1019 {

    public int[] nextLargerNodes(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList();
        while(node!=null){
            //循环一，遍历原链表中的每一个节点
            list.add(order(node));
            node = node.next;
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int order(ListNode node){
        int temp = node.val;
        while(node.next!=null){
            //循环二，遍历指定节点，比较后续值大小
            int v = node.next.val;
            if(v>temp){
                return v;
            }else{
                node = node.next;
            }
        }
        return 0;
    }
}
