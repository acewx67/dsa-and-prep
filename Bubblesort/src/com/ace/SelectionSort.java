package com.ace;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {6,-4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int max_pos = -1;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    max_pos = j;
                }
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[max_pos] = temp;
        }
    }
}
