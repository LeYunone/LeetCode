package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-08 16:58
 */
public class Questions713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int start=0;
        int sum=1;
        int result=0;
        for(int end=0;end<nums.length;end++){
            sum*=nums[end];
            while(sum>=k){
                sum/=nums[start];
                start++;
            }
            result+=end-start+1;
        }
        return result;
    }
}
