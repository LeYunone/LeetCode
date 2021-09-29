package com.leetcode.regular.leetcode;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-29 15:57
 * 257. 二叉树的所有路径
 */
public class Questions257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        resoleOrder(root,"",list);
        return list;
    }

    public void resoleOrder(TreeNode root,String path,List<String> list){
        if(root!=null){
            StringBuffer sb=new StringBuffer(path);
            sb.append(root.val);
            if(root.left==null && root.right==null){
                list.add(sb.toString());
            }else{
                sb.append("->");
                resoleOrder(root.left,sb.toString(),list);
                resoleOrder(root.right,sb.toString(),list);
            }
        }
    }
}
