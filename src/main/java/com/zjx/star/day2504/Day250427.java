package com.zjx.star.day2504;

/*
 *2025/4/27:10:47
 *version:1.0.0
 *@author:zjx
 */
public class Day250427 {

    public static void main(String[] args) {
        op01("a ");
        String[] op={"flower","flower","flower","flower"};
        op02(op);
    }

//      58  最后一个单词的长度
    public static int op01(String s) {

        int length = s.length();
        if (!s.contains(" ")){
            return length;
        }
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            }
            if (s.charAt(i) == ' '&& count != 0 ) {
                return count;
            }
        }

        return count;

    }

//    14    最长公共前缀
    public static String op02(String[] strs) {

        int length = strs.length;
        int max = Integer.MAX_VALUE;
        for (String str : strs) {
            max = Math.min(str.length(), max);
        }
        String s = "";
        for (int i = 0; i < max; i++) {
            Character j = strs[0].charAt(i);
            for (int k = 0; k < length; k++) {
                if (!j.equals(strs[k].charAt(i))) {
                    return s;
                }
            }
            s += j;
        }

        return s ;
    }

}
