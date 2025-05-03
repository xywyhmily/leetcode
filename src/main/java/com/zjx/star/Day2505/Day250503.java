package com.zjx.star.Day2505;

import java.util.Arrays;
import java.util.HashMap;

/*
 *2025/5/3:14:28
 *version:1.0.0
 *@author:zjx
 */
public class Day250503 {

    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "nagaram";
        op01(s1,s2);

    }

//    242.      有效的字母异位词
    public static boolean op01(String s, String t) {

        if (s == null || t == null) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if (tArray.length != sArray.length) {
            return false;
        }
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;

    }

}
