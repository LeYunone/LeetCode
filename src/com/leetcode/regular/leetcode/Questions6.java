package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-09 11:08
 * 6. Z 字形变换
 */
public class Questions6 {

    public static void main(String[] args) {
        convert("AB",1);
    }

    public static String convert(String s, int numRows) {
        List<StringBuffer> list=new ArrayList<>();
        for(int i=0;i<Math.min(s.length(),numRows);i++){
            list.add(new StringBuffer());
        }

        boolean is=false;
        int temp=0;
        for(char c:s.toCharArray()){
            list.get(temp).append(c);
            if(temp==0 || temp==numRows-1){
                is=!is;
            }
            temp+=is?1:-1;
        }
        StringBuffer result=new StringBuffer();
        for(StringBuffer sb:list){
            result.append(sb.toString());
        }
        return result.toString();
    }
}
