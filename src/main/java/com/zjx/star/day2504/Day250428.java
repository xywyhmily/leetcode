package com.zjx.star.day2504;

import java.util.HashSet;
import java.util.Set;

/*
 *2025/4/28:21:45
 *version:1.0.0
 *@author:zjx
 */
public class Day250428 {

    public static void main(String[] args) {

        op01(19);

    }

//      202     快乐数    当遇到重复值时就知道不是
    public static boolean op01(int n){

        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int totalSum = 0;
            while (n > 0) {
                int d = n % 10;
                n = n / 10;
                totalSum += d * d;
            }
            n = totalSum;
        }
        return n == 1;


    }

}
