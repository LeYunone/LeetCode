package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-12-06 13:59
 * 98. 验证二叉搜索树
 */
public class Questions98 {

    public static void main(String[] args) {
        TreeNode t=new TreeNode(2);
        t.left=new TreeNode(1);
        t.right=new TreeNode(3);
        isValidBST(t);
    }

    public static boolean isValidBST(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                TreeNode poll = queue.poll();
                int temp=poll.val;
                if(poll.left!=null){
                    if(poll.left.val>=temp){
                        return false;
                    }
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    if(poll.right.val<=temp){
                        return false;
                    }
                    queue.add(poll.right);
                }
                size--;
            }
        }
        return true;
    }
}
