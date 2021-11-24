package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-17 15:42
 */
public class Questions673 {

    public static void main(String[] args) {
        findNumberOfLIS(new int [] {1,3,5,4,7});
    }

    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length, maxLen = 0, ans = 0;
        int [] dp=new int [n];
        int [] count=new int [n];
        for(int i=0;i<n;i++){
            int temp=nums[i];
            dp[i]=1;
            count[i]=1;
            for(int j=0;j<i;j++){
                if(temp>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }else if(dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }
                }
            }
            if(dp[i]>maxLen){
                maxLen=dp[i];
                ans=count[i];
            }else if(dp[i]==maxLen){
                ans+=count[i];
            }
        }
        return ans;
    }
}
