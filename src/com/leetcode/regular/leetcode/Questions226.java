package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-29 10:00
 * 226. 翻转二叉树
 */
public class Questions226 {

    public TreeNode invertTree(TreeNode root) {
        resole(root);
        return root;
    }

    public void resole(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        resole(root.right);
        resole(root.left);
    }
}
