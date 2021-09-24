package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-24 15:18
 * 101. 对称二叉树
 */
public class Questions101 {

    public boolean isSymmetric(TreeNode root) {
        return isTrue(root.left,root.right);
    }

    public boolean isTrue(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        return left.val==right.val && isTrue(left.left,right.right) && isTrue(left.right,right.left);
    }
}
