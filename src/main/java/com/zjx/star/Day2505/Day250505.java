package com.zjx.star.Day2505;

import java.util.*;

/*
 *2025/5/5:21:09
 *version:1.0.0
 *@author:zjx
 */
public class Day250505 {

    public static void main(String[] args) {

    }

//      49   字母异位词分组
    public static List<List<String>> op01(String[] strs){

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());

    }

}
