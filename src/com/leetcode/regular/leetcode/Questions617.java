package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-14 11:08
 *
 * 617. 合并二叉树
 */
public class Questions617 {

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(null==root1){
            return root2;
        }
        if(null==root2){
            return root1;
        }
        TreeNode result=new TreeNode();
        result.val=root1.val+root2.val;
        result.left=mergeTrees(root1.left,root2.left);
        result.right=mergeTrees(root1.right,root2.right);
        return result;
    }
}

