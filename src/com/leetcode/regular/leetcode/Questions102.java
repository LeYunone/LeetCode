package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-12-03 11:04
 * 102. 二叉树的层序遍历
 */
public class Questions102 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.stream().forEach(t->{
            System.out.println(t);
        });
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list=new ArrayList<>();
            while(size>0){
                TreeNode poll = queue.poll();
                if(poll!=null){
                    list.add(poll.val);
                    if(poll.left!=null){
                        queue.add(poll.left);
                    }
                    if(poll.right!=null){
                        queue.add(poll.right);
                    }
                }
                size--;
            }
            if(list.size()!=0){
                res.add(list);
            }
        }
        return res;
    }
}
