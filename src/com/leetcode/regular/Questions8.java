package com.leetcode.regular;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @create 2021-09-15 14:19
 *  面试题 04.10. 检查子树
 */
public class Questions8 {

    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return false;
        }
        return ifTreeValSame(t1,t2) || checkSubTree(t1.left,t2) || checkSubTree(t1.right,t2);
    }

    public boolean ifTreeValSame(TreeNode t1,TreeNode t2){
        if(t1==t2){
            //当只有遍历到只有一个节点的时候，两者都为空的时候则说明一定相等了。
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        return t1.val==t2.val && ifTreeValSame(t1.left,t2.left) && ifTreeValSame(t1.right,t2.right);
    }
}
