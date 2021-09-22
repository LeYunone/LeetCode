package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-22 15:26
 * 14.最长公共前缀
 */
public class Questions14 {

    public static void main(String[] args) {
        String [] str={"c","acc","ccc"};
        longestCommonPrefix(str);
    }
    public static String longestCommonPrefix(String[] strs) {
        int pre=0;
        String max="";
        String temp=strs[0];
        boolean is=true;
        for(int i=0;i<temp.length();i++){ //循环第一个数组
            String index=temp.substring(pre,i+1);
            for(int j=0;j<strs.length;j++){
                String str=strs[j];
                if(!str.contains(index) || str.indexOf(index)!=0){
                    is=false;
                    break;
                }
            }
            if(is){
                max=max.length()<index.length()?index:max;
            }else{
                pre++;
            }
        }
        return max;
    }
}
