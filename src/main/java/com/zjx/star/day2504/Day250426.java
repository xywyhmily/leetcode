package com.zjx.star.day2504;

import java.util.HashMap;
import java.util.HashSet;

/*
 *2025/4/26:21:01
 *version:1.0.0
 *@author:zjx
 */
public class Day250426 {

    public static void main(String[] args) {
        op02("a","a");
    }

//    383   赎金信
    public static boolean op01(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) {
                Integer j = map.get(c);
                if (j==0) {
                    return false;
                }
                map.put(c, --j);
            }else {
                return false;
            }
        }

        return true ;

    }

//    28    找出字符串中第一个匹配项的下标
    public static int op02(String s1, String s2) {

        int s1Length = s1.length();
        int s2Length = s2.length();
        int n ;
        for (int i = 0; i < s1Length - s2Length + 1; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                if (s2Length == 1){
                    return i;
                }
                n = 1;
                for (int j = 1; j < s2Length; j++) {
                    if (s1.charAt(i + n) != s2.charAt(j)) {
                        break;
                    }else {
                        if (j == s2Length - 1) {
                            return i;
                        }
                    }
                    n++;
                }
            }

        }

        return -1 ;

    }

}
