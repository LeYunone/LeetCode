package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-15 13:39
 * 461. 汉明距离
 */
public class Questions461 {

    public static void main(String[] args) {
        hammingDistance(4,1);
    }

    public static int hammingDistance(int x, int y) {
        int temp=x ^ y;
        int count=0;
        while(temp!=0){
            int s=temp & 1;
            if( s == 1 ){
                count++;
            }
            temp=temp>>1;
        }
        return count;
    }
}
