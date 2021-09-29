package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-29 15:07
 */
public class Questions235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp=root;
        while(true){
            if(temp.val>p.val && temp.val>q.val){
                temp=root.left;
            }else if(temp.val<p.val && temp.val<q.val){
                temp=root.right;
            }else{
                return temp;
            }
        }
    }
}
