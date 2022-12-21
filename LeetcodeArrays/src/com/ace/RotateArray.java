package com.ace;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int [] arr_copy = Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(arr_copy));
        int k = 10;
        int i = k % arr.length;
        int j = 0;
        while(i < arr.length){
            arr[i] = arr_copy[j];
            i++;
            j++;
        }
//        System.out.println(Arrays.toString(arr));
        i = 0;
        while(j < arr.length){
            arr[i] = arr_copy[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(arr));

    }

}
