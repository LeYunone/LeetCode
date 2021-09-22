package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-18 14:41
    JZ II 093. 最长斐波那契数列

输入: arr = [1,3,7,11,12,14,18]
输出: 3
解释: 最长的斐波那契式子序列有 [1,11,12]、[3,11,14] 以及 [7,11,18] 。

 */
public class Questions_jz_II_93 {

    public int lenLongestFibSubseq(int[] arr) {
        int max=0;
        int pre=0;
        int next=1;
        for(int i=2;i<arr.length;i++){
            int temp=arr[pre]+arr[next];
            if(arr[i]==temp){
                pre=next;
                next=i;
            }
        }
        return max;
    }
}
