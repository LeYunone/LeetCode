package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-11-26 09:00
 * 700. 二叉搜索树中的搜索
 */
public class Questions700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        }
        return searchBST(val < root.val ? root.left : root.right, val);
    }
}
