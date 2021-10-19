package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-10-13 08:54
 * 17. 电话号码的字母组合
 */
public class Questions17 {

    public static void main(String[] args) {
        Questions17 questions17=new Questions17();
        questions17.letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {

        String [] map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        backOrder(result,map,digits,0,new StringBuilder());
        return result;
    }

    public void backOrder(List<String> result,String [] map,String digits,int index,StringBuilder sb){
        if(sb.length()==digits.length()){
            result.add(sb.toString());
        }else{
            char c = digits.charAt(index);
            String temp=map[c-48];
            for(int i=0;i<temp.length();i++){
                sb.append(temp.charAt(i));
                backOrder(result,map,digits,index+1,sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
