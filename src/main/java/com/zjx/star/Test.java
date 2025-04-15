package com.zjx.star;

import java.util.HashMap;
import java.util.Map;

/*
 *2025/4/13:20:32
 *version:1.0.0
 *@author:zjx
 */
public class Test {

    public static void main(String[] args) {
        Map<Demo, Integer> map = new HashMap<>();

        for (int i = 0; i < 16; i++) {
            Demo demo = new Demo();
            map.put(demo, i);
        }
    }

}
