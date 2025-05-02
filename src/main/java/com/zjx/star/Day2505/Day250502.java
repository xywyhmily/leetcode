package com.zjx.star.Day2505;

import java.util.Arrays;
import java.util.HashMap;

/*
 *2025/5/2:13:04
 *version:1.0.0
 *@author:zjx
 */
public class Day250502 {

    public static void main(String[] args) {

        int[] op ={1,0,1,2};
        op02(op);

    }

//      219     存在重复元素
    public static boolean op01(int[] nums, int k){

        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {

            if (map.containsKey(nums[i]) && i-map.get(nums[i]) <= k){

                return true;

            }

            map.put(nums[i],i);
        }

        return false;

    }

//      128     最长连续序列
    public static int op02(int[] nums){

        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0 ;
        int n = 1 ;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]+1 == nums[i+1]){
                n++;
            }else if (nums[i] == nums[i+1]){
                continue;
            } else {
                max = Math.max(n,max);
                n = 1;
            }

        }

        return Math.max(n,max);
    }

}
