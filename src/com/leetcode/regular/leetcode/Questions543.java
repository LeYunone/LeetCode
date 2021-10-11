package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-10-09 17:12
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *
 */
public class Questions543 {
    public int diameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int left=0; //左边的最大深度
        int right=0; //右边的最大深度
        if(root.left!=null){
            queue.add(root.left);
            while(!queue.isEmpty()){
                left++;
                TreeNode poll = queue.poll();
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
        }

        if(root.right!=null){
            queue.add(root.right);
            while(!queue.isEmpty()){
                right++;
                TreeNode poll = queue.poll();
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
        }
        return left+right;
    }
}
