package com.zjx.star.Day2505;

import java.util.HashMap;
import java.util.Map;

/*
 *2025/5/4:14:23
 *version:1.0.0
 *@author:zjx
 */
public class Day250504 {

    public static void main(String[] args) {

        String p1 = "add";
        String p2 = "egg";
        System.out.println(op01(p1,p2));

    }

//      205     同构字符串
    public static boolean op01(String s, String t){

        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;

    }

}
