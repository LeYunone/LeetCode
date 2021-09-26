package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @date 2021-09-25
 *
 * 104. 二叉树的最大深度
 */
public class Questions104 {

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int sum=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                TreeNode poll = queue.poll();
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);
                }
                size--;
            }
            sum++;
        }
        return sum;
    }
}
