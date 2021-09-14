package com.leetcode.regular;

/**
 * @author pengli
 * @create 2021-09-07 14:28
 *
 * 1685. 有序数组中差绝对值之和
 */
public class Questions2 {
    public static void main(String[] args) {
        int [] s={2,3,5};
        getSumAbsoluteDifferences(s);
    }
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int [] result=new int [nums.length];
        int index=0; //当前下标
        int pre=0; //前缀下标
        int preSum=0; //前缀和
        int sufSum=0; //后缀和
        while(index!=nums.length){
            int suf=index+1; //后缀下标
            while(pre!=index || suf!=nums.length){
                if(pre<index){
                    preSum+=nums[pre]; //前缀和
                    pre++;
                }
                if(suf<=nums.length-1){
                    sufSum+=nums[suf]; //后缀和
                    suf++;
                }
            }
            int sufCount=nums.length-1-index;
            result[index]=(sufSum-sufCount*nums[index])+(index*nums[index]-preSum);
            suf=0;
            pre=0;
            index++;
        }
        return result;
    }
}
