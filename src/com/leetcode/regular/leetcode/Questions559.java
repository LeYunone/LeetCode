package com.leetcode.regular.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pengli
 * @create 2021-11-22 08:41
 */
public class Questions559 {

    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        Queue<Node> queue=new LinkedList();
        queue.add(root);
        int result=0;
        while(!queue.isEmpty()){
            result++;
            int size = queue.size();
            while(size>0){
                Node node = queue.poll();
                if(node!=null && node.children!=null){
                    for(Node temp :node.children){
                        if(temp!=null){
                            queue.add(temp);
                        }
                    }
                }
            }
        }
        return result;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}

