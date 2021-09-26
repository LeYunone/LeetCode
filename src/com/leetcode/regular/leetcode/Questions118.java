package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-26 11:24
 * 118. 杨辉三角
 */
public class Questions118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        one.add(1);
        result.add(one);
        for(int i=1;i<=numRows;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            List<Integer> integers = result.get(i - 1);
            for(int j=1;j<integers.size();j++) {
                list.add(integers.get(j)+integers.get(j-1));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
