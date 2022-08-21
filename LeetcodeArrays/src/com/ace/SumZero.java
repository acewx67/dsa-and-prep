package com.ace;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        int n = 11;
        int [] arr = new int[n];
        int j = -1 * n/2;
        if(n % 2 == 0){       //n is even then,
            for(int i = 0;i< arr.length;i++){
                if(j == 0){
                    j++;
                }
                arr[i] = -1 * j;
                j++;
            }
        }
        else {
            for(int i = 0;i< arr.length;i++){
                arr[i] = -1 * j;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
