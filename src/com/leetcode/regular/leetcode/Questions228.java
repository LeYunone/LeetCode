package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-09-29 10:26
 * 228. 汇总区间
 */
public class Questions228 {

    public static void main(String[] args) {
        int ar[]={1};
        summaryRanges(ar);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        int start=0;
        int end=0;
        while(end!=nums.length-1){
            if(nums[end]+1!=nums[end+1]){
                if(start==end){
                    result.add(String.valueOf(nums[end]));
                }else{
                    result.add(nums[start]+"->"+nums[end]);
                }
                start=end+1;
            }
            end++;
        }
        if(start==0&& end==0){
            result.add(String.valueOf(nums[0]));
            return result;
        }
        if(nums[end-1]+1==nums[end]){
            result.add(nums[start]+"->"+nums[end]);
        }else{
            result.add(String.valueOf(nums[end]));
        }
        return result;
    }
}
