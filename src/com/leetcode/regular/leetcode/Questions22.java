package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-13 10:21
 * 22. 括号生成
 */
public class Questions22 {

    public List<String> list=new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        getParenth("",n,n);
        return list;
    }

    public void getParenth(String temp,int right,int left){
        if(right==0 && right == left){
            list.add(temp);
            return;
        }
        if(right==left){
            getParenth(temp+"(",right,left-1);
        }
        if(right>left){
            if(left>0){
                getParenth(temp+"(",right,left-1);
            }
            getParenth(temp+")",right-1,left);
        }
        return;
    }
}
