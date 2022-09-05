package com.ace;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,0,0,0,0,0,0,0,0,0,0};
        int numbers = digits.length;
        int temp = numbers - 1;
        int temp1 = 0;
        double array_num = 0;
        int count = 0;
        while (count < digits.length) {
            array_num += digits[count] * Math.pow(10, temp);
            count++;
            temp--;
        }
        array_num += 1;
        numbers = (int) Math.log10(array_num) + 1;
        int[] ans = new int[numbers];
//        temp = numbers - 1;
        for(int i = numbers-1;i >= 0;i--){
            ans[i] = (int)array_num % 10;

            array_num /= 10;
        }
        System.out.println(Arrays.toString(ans));
    }
}























//    public static void main(String[] args) {
//        int [] arr = {9,8,7,6,5,4,3,2,1,0};
//        long sum = 0;
////        int count = arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            int mult = 1;
//            for (int j = arr.length-1-i; j > 0; j--) {
//                mult *= 10;
//            }
//            sum += arr[i]*mult;
//        }
//        System.out.println(sum);
//        sum = sum + 1;
//        long quot = sum;
//        int size = 0;
//        while(quot > 0){
//            quot = quot/10;
//            size++;
//        }
//        int [] ans = new int [size];
//        int quo = 1;
//        int rem = 0;
//        int i =0;
//        while(sum > 0){
//            ans[i] =(int) sum%10;
//            sum = sum/10;
//            i++;
//        }
//        //rearrange the array
//        int start = 0;
//        int end = ans.length-1;
//        int k = 0;
//        while(start < end){
//            int temp = ans[end];
//            ans[end] = ans[start];
//            ans[start] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(ans));
//
//
//
//
//    }
//}
