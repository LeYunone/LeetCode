package com.leetcode.regular.leetcode;

import java.util.Arrays;

/**
 * @author pengli
 * @create 2021-09-10 10:05
 */
public class Questions1818 {

    public static void main(String[] args) {
        int [] num1={1,10,4,4,2,7};
        int [] num2 = {9,3,5,1,7,4};
        int i = minAbsoluteSumDiff(num1, num2);
        System.out.println(i);
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int maxDis=0;
        int index=0; //最大差的下标
        int sum=0; //未交换前的绝对差值和
        for(int i=0;i<nums1.length;i++){
            int abs = Math.abs(nums1[i] - nums2[i]);
            if(abs>maxDis){
                maxDis=abs;
                index=i;
            }
            sum+=abs;
        }
        //找到最接近最大差下标的值
        int temp=nums2[index];
        Arrays.sort(nums1); //将nums1排序
        int left=0;
        int right=nums1.length-1;
        while(left<right){
            int mid=(left+right+1)/2;
            if(nums1[mid]>temp){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        int abs = Math.abs(nums1[right] - temp);
        int num=maxDis-abs;
        return sum-num;
    }
}
