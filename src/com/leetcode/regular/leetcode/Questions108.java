package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

/**
 * @author pengli
 * @date 2021-09-25
 *
 * 108. 将有序数组转换为二叉搜索树
 */
public class Questions108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return orderArray(nums,0,nums.length-1);
    }

    public TreeNode orderArray(int [] nums,int left,int right){
        if(left>=right) {
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=orderArray(nums,left,mid-1);
        root.right=orderArray(nums,mid+1,right);
        return root;
    }
}
