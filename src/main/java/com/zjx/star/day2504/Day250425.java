package com.zjx.star.day2504;

import java.util.HashMap;

/*
 *2025/4/25:14:06
 *version:1.0.0
 *@author:zjx
 */
public class Day250425 {

    public static void main(String[] args) {

        op01("MCMXCIV");

    }
//    13   罗马数字转整数
    public static int op01(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        int sum = 0;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {

            Integer i1 = map.get(s.charAt(i));

            if (i1 > max){
                sum += i1 - max * 2  ;
            }else {
                sum += i1;
            }
            max = i1 ;


        }

        return sum;

    }
//    12    整数转罗马数字
    public static String op02(int num) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        int n ;
        int j = 1 ;
        String s = "" ;
        String j1,j2 ;

        while (num > 0) {

            n = num % 10;
            num = num / 10;

            switch (n){
                case 1:
                case 2:
                case 3:
                    j1 = map.get(j);
                    for (int i = 0; i < n; i++) {
                        s = j1 + s ;
                    }
                    break;
                case 4:
                    j1 = map.get(j);
                    j2 = map.get(j * 5);
                    s = j1 + j2 + s;
                    break;
                case 5:
                    j1 = map.get(j * 5);
                    s = j1 + s;
                    break;
                case 6:
                case 7:
                case 8:
                    j1 = map.get(j);
                    j2 = map.get(j * 5);
                    for (int i = 0; i < n - 5; i++) {
                        s = j1 + s ;
                    }
                    s = j2 + s ;
                    break;
                case 9:
                    j1 = map.get(j);
                    j2 = map.get(j * 10);
                    s =j1 + j2 + s ;
                    break;
            }
            j *= 10 ;

        }

        return s ;
    }

}
