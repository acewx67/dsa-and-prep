package com.ace;

import java.util.Arrays;

public class PlusOne66Working {
    public static void main(String[] args) {
        int [] arr = {9,9,9};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int [] ans(int [] arr){
        if(arr[arr.length-1] < 9){
            arr[arr.length-1]++;
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[arr.length-1-i] == 9){
                arr[arr.length-1-i] = 0;
            }
            else {
                arr[arr.length - 1 - i]++;
                return arr;
            }
        }
        int [] digits = new int [arr.length+1];
        digits[0] = 1;
        return digits;


    }

}
