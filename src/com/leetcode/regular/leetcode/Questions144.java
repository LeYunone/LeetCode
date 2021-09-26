package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-26 16:34
 */
public class Questions144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preOrder(root,result);
        return result;
    }

    public  void preOrder(TreeNode root, List<Integer> list){
        if(root!=null){
            list.add(root.val);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }
}
