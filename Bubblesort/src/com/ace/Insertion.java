package com.ace;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int []arr = {5,3,8,1,9,5,8,2};
        Insert(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Insert(int [] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
