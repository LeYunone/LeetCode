package com.leetcode.regular.leetcode;

import com.leetcode.bean.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-11-08 15:12
 * 117. 填充每个节点的下一个右侧节点指针 II
 */
public class Questions117 {

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                Node poll = queue.poll();
                if(i!=temp){
                    Node next = queue.peek();
                    poll.next=next;
                }else{
                    poll.next=null;
                }

                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
        return root;
    }
}
