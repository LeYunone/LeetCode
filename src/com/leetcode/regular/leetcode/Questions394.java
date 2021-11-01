package com.leetcode.regular.leetcode;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-11-01 10:57
 * 394. 字符串解码
 */
public class Questions394 {

    public static void main(String[] args) {
        decodeString("3[a2[c]]");
    }

    public static String decodeString(String s) {
        String result="";
        Stack<Integer> numStack=new Stack<>();
        Stack<String> strStack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(Character c:s.toCharArray()){
           if(c.charValue()>= '0' && c.charValue()<='9'){
               //如果是数字进数字栈中
               numStack.push(Integer.valueOf(c-'0'));
               continue;
            }
           if(c.charValue()=='['){
               if(sb.length()!=0){
                   strStack.push(sb.toString());
                   sb.delete( 0, sb.length() );
               }
               continue;
           }
           if(c.charValue()==']'){
               strStack.push(sb.toString());
               sb.delete( 0, sb.length() );
               continue;
           }
           sb.append(c);
        }
        String str="";
        strStack.pop();
        while(!numStack.isEmpty()){
            int count=numStack.pop();
            str = strStack.pop()+result;

            for(int i=1;i<=count;i++){
                result=str+result;
            }
        }
        return result;
    }
}
