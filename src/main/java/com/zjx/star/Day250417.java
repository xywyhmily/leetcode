package com.zjx.star;

import java.util.*;

/*
 *2025/4/17:15:46
 *version:1.0.0
 *@author:zjx
 */
public class Day250417 {

    public static void main(String[] args) {

        int [] nums = {1,3,1};

    }

//      274，H指数
//    给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
//    根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
    public static int op01(int[] citations) {

        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;

    }
//  238 除以自身的数组积
    public static int[] op02(int[] nums) {

        int length = nums.length;
        int[] kp = new int[length];
        int count = 1;
        int n ;

        for (int i = 0; i < length; i++) {
            if (i > 0) {
                count *= nums[i-1];
            }
            n = count;
            for (int j = i+1; j < length; j++) {
                n *= nums[j];
            }
            kp[i] = n;

        }

        return kp;
    }

    public static int op03(int[] ratings) {

        int length = ratings.length;
        int count = 0;

        for (int i = 0; i < length-1; i++) {

            if (ratings[i] > ratings[i+1]) {

            }else if (ratings[i] < ratings[i+1]) {

            }else {

            }

        }

        return 0 ;
    }

}

//  380. O(1) 时间插入、删除和获取随机元素
//实现RandomizedSet 类：
//
//        RandomizedSet() 初始化 RandomizedSet 对象
//        bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
//        bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
//        int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
//        你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> indices;
    Random random;

    public RandomizedSet() {
        nums = new ArrayList<Integer>();
        indices = new HashMap<Integer, Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indices.containsKey(val)) {
            return false;
        }
        int index = nums.size();
        nums.add(val);
        indices.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        if (!indices.containsKey(val)) {
            return false;
        }
        int index = indices.get(val);
        int last = nums.get(nums.size() - 1);
        nums.set(index, last);
        indices.put(last, index);
        nums.remove(nums.size() - 1);
        indices.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}