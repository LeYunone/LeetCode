package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @date 2021-09-29
 * 338. 比特位计数
 */
public class Questions338 {

    public int[] countBits(int n) {
        int [] ar=new int [n+1];
        for(int i=0;i<ar.length;i++){
            int count=0;
            int temp=i;
            while(temp!=0){
                int a=temp%2;
                if(a==1){
                    count++;
                }
                temp=temp/2;
            }
            ar[i]=count;
        }
        return ar;
    }
}
