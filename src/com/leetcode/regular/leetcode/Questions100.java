package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-24 14:56
 *
 * 100. 相同的树
 */
public class Questions100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isTrue(p,q);
    }

    public boolean isTrue(TreeNode p,TreeNode q){
        if(p==q){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val==q.val && isTrue(p.left,q.left) && isTrue(p.right,q.right);
    }
}
