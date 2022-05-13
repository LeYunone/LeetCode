package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-13
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * <p>
 * 返回这三个数的和。
 * <p>
 * 假定每组输入只存在恰好一个解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Questions16 {

    public static void main(String[] args) {
        threeSumClosest(new int []{1,1,-1,-1,3},-1);
        //-4 -1 1 2
    }

    public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int temp = nums[i]+nums[left]+nums[right];
                if(temp == target){
                    return temp;
                }
                int v = temp - target;

                if(Math.abs(v) < Math.abs(min)){
                    min = v;
                }
                if(temp>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return min+target;
    }
}
