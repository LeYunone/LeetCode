package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-24 14:08
 * 88. 合并两个有序数组
 */
public class Questions88 {

    public static void main(String[] args) {
        int [] ar={0};
        int [] ar2={1};
        merge(ar,0,ar2,1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1=nums2;
        }else{
            int left=0;
            int right=n;
            int len=nums1.length;
            while(n!=0 && right!=len){
                if(nums2[right-n]<nums1[left]){
                    nums1[right]=nums1[left];
                    nums1[left]=nums2[right-n];
                    right++;
                }else{
                    left++;
                    if(left>m){
                        nums1[left]=nums2[right-n];
                        right++;
                    }
                }
            }
        }
    }
}

