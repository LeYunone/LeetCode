package com.leetcode.happy;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-19
 * 沙雕代码   睡眠排序
 */
public class SleepSort {

    public static void main(String[] args) {
        int [] arr = {5,8,1,4,6,2,3};
        sleepSort(arr);
    }

    public static void sleepSort(int [] arr){
        for(int i:arr){
            final int num = i;
            new Thread(()->{
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }).start();;
        }
    }
}
