package com.ace;

import java.util.Arrays;

public class ShuffleArrayOptimized {

    public static void main(String[] args) {
        int []arr = {7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        int n = 7;
        swap(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int n){
        //store 2 elements of array into one element
        for (int i = 0; i < n; i++) {
            int temp = arr[n+i];
            arr[n+i] = arr[i]*10_000 + temp;
        }
        int j = 0;
        for(int i = 0; i< arr.length; i = i+2){
            arr[i] = arr[n+j] / 10_000;
            arr[i+1] = arr[n+j] % 10_000; //or %10_000 doesn't matter we need just the last digit
            j++;
        }
    }
}
