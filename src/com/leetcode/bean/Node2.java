package com.leetcode.bean;

import java.util.List;

/**
 * @author pengli
 * @create 2021-11-22 09:19
 */
public class Node2 {
    public int val;
    public List<Node> children;

    public Node2() {}

    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
