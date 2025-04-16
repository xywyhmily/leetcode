package com.zjx.star;

/*
 *2025/4/16:15:28
 *version:1.0.0ma
 *@author:zjx
 */
public class Day250416 {

    public static void main(String[] args) {
        int [] jk = {1,1,2,2,0,1,1} ;
        op02(jk);

    }

    public static int op01(int[] prices) {

        int length = prices.length;
        int left = 0 ,right = length - 1 ;
        int max = 0;
        while (left < right) {
            if (prices[right-1] <= prices[right]) {
                right--;
            }
            if (prices[left] >= prices[left+1]) {
                left++;
            }
            max = Math.max(max, prices[left] - prices[left+1]);
        }
        if (max <= 0) {
            return 0;
        }

        return max;
    }

//    给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
//    判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
    public static boolean op02(int[] nums) {

        int length = nums.length;
        int n = 0 ;
        while (n < length - 1) {
            if (nums[n] == 0 ){
                for (int j = n ; j >= 0 ; j--) {
                    if (nums[j] > n - j) {
                        n=j;
                        break;
                    }
                    if (j == 0){
                        return false ;
                    }
                }
            }
            n += nums[n] ;
        }
        if (n+1 >= length){
            return true;
        }

        return false ;
    }

}
