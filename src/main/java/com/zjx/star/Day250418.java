package com.zjx.star;

/*
 *2025/4/18:14:47
 *version:1.0.0
 *@author:zjx
 */
public class Day250418 {

    public static void main(String[] args) {

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {3,4,5,1,2};
        System.out.println(op01(p1,p2));

    }

    public static int op01(int[] gas, int[] cost){

        int length = gas.length;
        int sum ;
        int count ;
        int j ;

        for(int i = 0; i < length; i++){

            count = 0 ;
            sum = 0 ;
            j = i ;
            while (count < length){

                sum += gas[j];
                sum -= cost[j];
                if (sum >= 0){
                    count++;
                    j++;
                }else {
                    if (j<i){
                        return -1 ;
                    }
                    break;
                }

                if (j == length){
                    j = 0 ;
                }
            }
            if (count == length){
                return i ;
            }

        }

        return -1;
    }

}
