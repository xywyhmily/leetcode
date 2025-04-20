package com.zjx.star.day2504;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *2025/4/20:16:34
 *version:1.0.0
 *@author:zjx
 */
public class Day250420 {

    public static void main(String[] args) {

    }
//      17 电话号码的字母组合
    public static List<String> op01(String digits) {

        ArrayList<String> list = new ArrayList<>();
        if (digits.equals("")) {
            return list;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqs");
        map.put("8","tuv");
        map.put("9","wxyz");

        int length = digits.length();
        for (int i = 0; i < length; i++) {

            map.get(digits.charAt(i));

        }

        return null;

    }
}
