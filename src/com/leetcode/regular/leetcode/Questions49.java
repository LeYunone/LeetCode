package com.leetcode.regular.leetcode;

import java.util.*;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-13
 */
public class Questions49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String v = String.valueOf(chars);
            if(map.containsKey(v)){
                map.get(v).add(s);
            }else{
                List<String> list = new ArrayList();
                list.add(s);
                map.put(v,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
