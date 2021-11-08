package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-11-08 14:57
 *
 * 572. 另一棵树的子树
 */
public class Questions572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        return order(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean order(TreeNode root,TreeNode subRoot){
        if(root==subRoot){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        return root.val==subRoot.val && order(root.left,subRoot.left) && order(root.right,subRoot.right);
    }
}
