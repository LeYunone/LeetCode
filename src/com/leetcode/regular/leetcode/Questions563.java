package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.List;

/**
 * @author pengli
 * @create 2021-11-18 09:40
 * 563. 二叉树的坡度
 */
public class Questions563 {

    public int result=0;

    public int findTilt(TreeNode root) {
        order(root);
        return result;
    }

    public int order(TreeNode root){
        if(root==null){
            return 0;
        }
        int sumleft=order(root.left);
        int sumright=order(root.right);
        result+=Math.abs(sumleft-sumright);
        return sumleft+sumright+root.val;
    }

}
