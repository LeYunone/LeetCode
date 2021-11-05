package com.leetcode.regular.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-11-05 11:01
 * 986. 区间列表的交集
 */
public class Questions986 {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstX=0;
        int secondX=0;
        List<int[]> list=new ArrayList<>();
        while(firstX<firstList.length && secondX<   secondList.length){
            int start=Math.max(firstList[firstX][0],secondList[secondX][0]);
            int end=Math.min(firstList[firstX][1],secondList[secondX][1]);
            if(end>=start){
                list.add(new int []{start,end});
            }
            if(firstList[firstX][1]>secondList[secondX][1]){
                secondX++;
            }else{
                firstX++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
