package com.ace;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
            // write your code here
            int [] arr ={-3,7,23,45,67,89,100};
            int result = min_search(arr);
            System.out.println(result);
    }
    static int min_search(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
}