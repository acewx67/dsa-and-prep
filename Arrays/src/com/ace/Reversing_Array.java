package com.ace;

import java.util.Arrays;

public class Reversing_Array {
    public static void main(String[] args) {
        int[] arr = {1,7,56,77,89,99};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr1) {
        int start = 0;
        int end = arr1.length -1;
        int temp = 0;
        while(start < end){
            temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
    }
}
