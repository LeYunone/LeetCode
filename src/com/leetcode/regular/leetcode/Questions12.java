package com.leetcode.regular.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengli
 * @create 2021-10-09 14:44
 * 12. 整数转罗马数字
 */
public class Questions12 {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            int numTemp=values[i];
            String strTemp=strings[i];
            while(num>=numTemp){
                sb.append(strTemp);
                num=num-numTemp;
            }
            if(num==0){
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
