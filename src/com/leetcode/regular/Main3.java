package com.leetcode.regular;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-15
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String next = sc.next();
        Queue<Character> queue = new LinkedList<>();
        for (Character c : next.toCharArray()) {
            queue.add(c);
        }
        TreeNode temp = new TreeNode();
        TreeNode node = new TreeNode(queue.poll());
        temp.left = node;
        while (!queue.isEmpty()) {
            Character poll = queue.poll();
            if (poll == '{') {
                Character c1 = queue.poll();
                if(c1 != ','){
                    
                }
            }
        }

    }

    static class TreeNode {
        public Character val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(Character val) {
            this.val = val;
        }

        public TreeNode(Character val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
