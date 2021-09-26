package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-26 10:47
 * 112. 路径总和
 */
public class Questions112 {

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(2);
        TreeNode treeNode1=new TreeNode(3);
        treeNode.right=treeNode1;
        boolean is=hasPathSum(treeNode,5);
        System.out.println(is);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return isTrue(root,targetSum);
    }

    public static boolean isTrue(TreeNode root,int tar){
        if(root==null || root.val>tar){
            return false;
        }
        if(root.val==tar && root.left==null && root.right==null){
            return true;
        }
        return isTrue(root.left,tar-root.val) || isTrue(root.right,tar-root.val);
    }
}
