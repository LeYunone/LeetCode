package com.leetcode.regular;

/**
 * @author pengli
 * @create 2021-09-07 14:28
 *
 * 1685. 有序数组中差绝对值之和    [错误]
 */
public class Questions2_fail {
    public static void main(String[] args) {
        int [] s={1,4,6,8,10};
        getSumAbsoluteDifferences(s);
    }
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int len=nums.length;
        int [] result=new int[len];
        int [] preSum=new int [len];
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            preSum[i]=sum;
        }
        int sufSum=0; //后缀和
        for(int i=0;i<len;i++){
            sufSum=preSum[len-1]-preSum[i];
            result[i]=(sufSum-(len-1-i)*nums[i])+((i+1)*nums[i]-preSum[i]);
        }
        return result;
    }
}
