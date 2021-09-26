package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-09-26 09:11
 *
 * 111. 二叉树的最小深度
 */
public class Questions111 {

    public static void main(String[] args) {
        TreeNode node=new TreeNode(3);
        TreeNode node2=new TreeNode(9);
        TreeNode node3=new TreeNode(20);
        TreeNode node4=new TreeNode(15);
        TreeNode node5=new TreeNode(7);
        node.left=node2;
        node.right=node3;
        node3.left=node4;
        node3.right=node5;
        minDepth(node);
    }

    public static int minDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int min=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode poll = queue.poll();
                if(poll.right==null &&  poll.left==null){
                    return min;
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                size--;
            }
            min++;
        }
        return min;
    }
}
