package com.ace;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,4,1,2,6};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while(arr[i] != i+1){
                int correctIndexOfarr_i = arr[i] - 1;
                swap(arr,i,correctIndexOfarr_i);
            }
        }
    }
    static void swap(int [] arr,int i,int correctIndexOfarr_i){
        int temp = arr[i];
        arr[i] = arr[correctIndexOfarr_i];
        arr[correctIndexOfarr_i] = temp;
    }
}
