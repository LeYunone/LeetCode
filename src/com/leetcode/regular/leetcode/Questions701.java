package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-12-06 09:50
 * 701. 二叉搜索树中的插入操作
 */
public class Questions701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=root;
        TreeNode node=new TreeNode(val);
        while(temp!=null){
            if(val<=temp.val){
                if(temp.left==null){
                    temp.left=node;
                    break;
                }
                temp=temp.left;
            }else{
                if(temp.right==null){
                    temp.right=node;
                    break;
                }
                temp=temp.right;
            }
        }
        return temp==null?node:root;
    }
}
