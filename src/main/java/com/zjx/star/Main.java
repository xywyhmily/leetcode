package com.zjx.star;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Long start = System.currentTimeMillis();
        int[] op ={1,2,3,4,5,6,7} ;
        new Main().op12(op,3);
        System.out.println(System.currentTimeMillis()-start);

    }
    public void op02(char[] s) {
        int length = s.length;
        for (int i = 0; i < length/2; i++){
            char temp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = temp;
        }
        System.out.println(Arrays.toString(s));

    }

    public void op03(int[] nums) {

        int fast=0,slow=0;
        while(fast<nums.length){
            if (nums[slow]!=0){
                int temp = nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
            fast++;
        }

    }

    public boolean op04(String s) {

        s = s.toLowerCase();
        int length = s.length();
        int right=length-1,left=0;
        boolean b = true ;
        boolean l = true , r = true ;
        while (left<length){

            if (!(Character.isLetterOrDigit(s.charAt(left)))){
                left++;
                l=false;
            }else {
                l=true;
            }

            if (!(Character.isLetterOrDigit(s.charAt(right)))){
                right--;
                r=false;
            }else {
                r=true;
            }

            if (l&&r){
                if (s.charAt(left) == s.charAt(right)) {
                    b = true;
                    if ((left == right)||(right-left<=2)) {
                        break;
                    }
                    left++;
                    right--;
                } else {
                    b = false;
                    break;
                }
            }

            if (left == right) {
                b = true ;
                break;
            }


        }

        return b ;

    }
    public boolean op05(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();
        int slow=0,fast=0;
        if (tLength<sLength){
            return false;
        }
        while (slow<sLength&&fast<tLength) {

            if (s.charAt(slow)==t.charAt(fast)) {

                slow++;
                fast++;
                if (slow<sLength && fast == tLength) {
                    return false;
                }

            }else {
                fast++;
                if (fast==tLength) {
                    return false;
                }
            }

        }
        return true ;
    }

    public int op06(int [] height){

        int length = height.length;
        int left=0, right =length-1;
        int max = 0;
        while (left<right){

            if(height[left]>height[right]){
                max=Math.max(max,(height[right])*(right-left));
                right--;
            }else {
                max=Math.max(max,(height[left])*(right-left));
                left++;
            }

        }

        return max;
    }

    public List<List<Integer>> op07(int[] nums){

        ArrayList<List<Integer>> listAll = new ArrayList<>();
        Arrays.sort(nums);

        int length = nums.length;
        int left , right,target;

        for (int i=0;i<length;i++){

            if (nums[i]>0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            target = -nums[i];
            left = i + 1 ;
            right = length - 1 ;

            while (left < right) {

                if (target>nums[left] + nums[right]){
                    while (left<right && target>nums[left] + nums[right]){
                        left++;
                    }
                }else if (target<nums[left] + nums[right]){
                    while (left<right && target<nums[left] + nums[right]){
                        right--;
                    }
                }else {
                    listAll.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }



            }

        }

        return listAll;
    }

    public void op08(int[] nums1, int m, int[] nums2, int n) {

        int [] op = new int [m+n] ;
        int m1 = 0 , n1 = 0 ;
        int kp=0;
        int k;
        while (m1<m||n1<n){
            if ( m1 == m ) {
                k=nums2[n1++];
            }else if (n1==n){
                k=nums1[m1++];
            }else if (nums1[m1]>=nums2[n1]){
                k=nums2[n1];
                n1++;
            }else {
                k=nums1[m1];
                m1++;
            }
            op[kp++]=k;
        }
        for (int i=0;i<m+n;i++){
            nums1[i]=op[i];
        }

    }

    public int op09(int[] nums, int val) {

        int length = nums.length ;
        int kp = 0 ;
        for (int i=0;i<length;i++){
            if (nums[i]!=val){
                nums[kp++]=nums[i];
            }
        }

        return kp;
    }

    public int op10(int[] nums) {

        int length = nums.length;
        if (length<=2) {
            return length;
        }
        int slow = 0 ;
        boolean flag = true ;
        for (int i=1;i<length;i++){
            if (nums[i]==nums[slow]){
                if (flag){
                    flag = false ;
                    nums[++slow]=nums[i];
                }
            }else {
                flag = true ;
                nums[++slow]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));

        return ++slow ;
    }

    public int op11(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int max = 0 ;
        int kp = 0 ;
        for (int i=0;i<length;i++){
            int hj = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], hj );
            if (hj>max){
                max = hj;
                kp = nums[i] ;
            }
        }

        return kp;
    }

    public void op12(int[] nums, int k) {

        int length = nums.length;
        int[] ints = Arrays.copyOfRange(nums, 0, length );
        int hj = k % length;
        int temp ;
        for (int i=0;i<length;i++){
            nums[(i+hj)%length]=ints[i];
        }
        System.out.println(Arrays.toString(nums));

    }

    public int op(int[] nums) {

        int length = nums.length;
        int j=0;
        int k=1;
        boolean flag = false;
        for (; k < length;k++) {
            if (nums[j] == nums[k]) {

            }else {
                j++;
                nums[j] = nums[k];
            }

        }

        return ++j;
    }
    public void reString(String s) {
        s=new String("op");
    }
    public static int op=32;
public List<Integer> findSubstring(String s, String[] words) {

        

        return null ;
}

public int[] twoSum(int[] nums, int target) {

        int[] op = null;
//        int a;
//        int b;
//        for (int i = 0 ; i < nums.length ; i++) {
//            a = nums[i];
//            for (int j = i + 1 ; j < nums.length ; j++) {
//                b = nums[j];
//                if (a + b == target) {
//                    op[0] = i;
//                    op[1] = j;
//                }
//            }
//        }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            op = new int[]{map.get(target - nums[i]), i};
        }
        map.put(nums[i], i);
    }

    return op ;
}
    public Integer demo02(String s ) {

        HashSet<Character> chars = new HashSet<>();
        int max = 0;
        int n = s.length();
        int p=0;
        for (int i = 0; i < n; i++) {
            if (i>0){
                chars.remove(s.charAt(i-1));
            }
            while (p<n&&!chars.contains(s.charAt(p))) {
                chars.add(s.charAt(p));
                p++;
            }
            max = Math.max(max, p-i);
        }
        return max;
    }



    public String demo03(String s ) {

        Set<Character> chars = new HashSet<>();
        String max = null ;
        int n = s.length();
        String[] num = new String[n];
        ArrayList<Character> characters = new ArrayList<>();
        int p = 0 ;
        if (n<2){
            return s;
        }
        int max_num = 0 ;

        for (int i = 0; i < s.length(); i++) {

            if (i>1){
                chars = new HashSet<>();
                p=i;
            }

            while (p<n&&!chars.contains(s.charAt(p))) {

                chars.add(s.charAt(p));
                characters.set(p, s.charAt(p));
                p++;

            }
            max_num = p - i ;
            while (p<n&&chars.contains(s.charAt(p))) {

                p++;
                max_num++;

            }


        }


        return max;
    }




////        给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
////        算法的时间复杂度应该为 O(log (m+n)) 。
//
//        int [] a = {1,2};
//        int [] b = {3,4};
//        double v = new Main().demo01(a, b);
//        System.out.println(v);
    public double demo01(int[] a , int[] b){
        int [] c= new int[a.length+b.length];
        for (int i = 0; i < a.length+b.length; i++) {
            if (i < a.length){
                c[i] = a[i];
            }else {
                c[i] = b[i-a.length];
            }
        }
        Arrays.sort(c);
        if (c.length%2==0){
            int i = c[c.length / 2 - 1];
            int i1 = c[c.length / 2];
            return ( i + i1)/2.0;
        }else {
            return c[c.length/2];
        }
    }
}