package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-09-26 13:36
 * 121. 买卖股票的最佳时机
 */
public class Questions121 {

    public static void main(String[] args) {
        int [] ar={1,2};
        maxProfit(ar);
    }

    public static int maxProfit(int[] prices) {
        int maxIndex=0;
        int minIndex=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            minIndex=prices[minIndex]>prices[i]?i:minIndex; //确定最低谷的股票
            int temp=prices[i]-prices[minIndex];
            maxIndex=temp>max?i+1:maxIndex;
            max=temp>max?temp:max;
        }
        return max;
    }
}
