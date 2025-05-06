package com.zjx.star.Day2505;

import java.util.List;

/*
 *2025/5/6:14:42
 *version:1.0.0
 *@author:zjx
 */
public class Day250506 {

    public static void main(String[] args) {

    }

//      21      合并两个有序链表
    public static ListNode op01(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = op01(l1.next, l2);
            return l1;
        } else {
            l2.next = op01(l1, l2.next);
            return l2;
        }

    }

//      2    两数相加
    public static ListNode op02(ListNode l1, ListNode l2){

        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;

    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}