package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-26 16:38
 *
 * 145. 二叉树的后序遍历
 */
public class Questions145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        behindOrder(root,result);
        return result;
    }

    public void behindOrder(TreeNode root,List<Integer> list){
        if(root!=null){
            behindOrder(root.left,list);
            behindOrder(root.right,list);
            list.add(root.val);
        }
    }
}
