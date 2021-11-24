package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-22 14:57
 */
public class Questions376 {

    public static void main(String[] args) {
        wiggleMaxLength(new int [] {3,3,3,2,5});
    }

    public static int wiggleMaxLength(int[] nums) {
        int len=nums.length;
        if(len<2){
            return len;
        }
        int temp=nums[1]-nums[0];
        int dif=temp;
        int res=temp!=0?2:1;
        for(int i=2;i<nums.length;i++){
            int index=nums[i]-nums[i-1];
            if((index>0 && dif<=0) && (index<0 && dif>=0)){
                res++;
                dif=index;
            }
        }
        return res;
    }
}
