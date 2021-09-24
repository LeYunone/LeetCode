package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-24 14:49
 * 94. 二叉树的中序遍历
 */
public class Questions94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        midOrder(root,result);
        return result;
    }

    public void midOrder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        midOrder(root.left,list);
        list.add(root.val);
        midOrder(root.right,list);
    }
}
