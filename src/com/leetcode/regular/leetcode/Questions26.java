package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-22 16:31
 *
 * 26.删除有序数组中的重复项
 */
public class Questions26 {

    public static void main(String[] args) {
        int [] ar={1,1,2};
        removeDuplicates(ar);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int pre=0;
        int next=1;
        while(next<nums.length){
            if(nums[next]==nums[pre]){
                next++;
            }else{
                pre++;
                nums[pre]=nums[next];
            }
        }
        return pre+1;
    }
}
