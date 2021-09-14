package com.leetcode.regular;

import java.util.Stack;

/**
 * @author pengli
 * @create 2021-09-13 14:17
 *
 * 739. 每日温度
 */
public class Questions4 {

    public static void main(String[] args) {
        int [] s={73,74,75,71,69,72,76,73};
        dailyTemperatures(s);
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack(); //温度文档
        int [] result=new int [temperatures.length];
        for(int i=0;i<temperatures.length;i++){
                //如果遍历到了大于栈底元素的值，就将栈顶小于他的值清空弹出
            while(!stack.empty() && temperatures[stack.peek()]<temperatures[i]){
                Integer pop = stack.pop();
                result[pop]=i-pop;
            }
            stack.push(i);
        }
        while(!stack.empty()){
            result[stack.pop()]=0;
        }
        return  result;
    }
}
