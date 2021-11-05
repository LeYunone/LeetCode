package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-05 11:26
 * 11. 盛最多水的容器
 *
 */
public class Questions11 {

    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int sum=0;
        while(left<=right){
            int h=Math.min(height[left],height[right]);
            sum=Math.max(sum,(right-left)*h);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return sum;
    }
}
