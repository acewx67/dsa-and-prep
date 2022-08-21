package com.ace;

import java.util.ArrayList;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        triangle(arr,0);
    }

    static void triangle(int[] arr,int sum,int n) {
        if(n < 5){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int sume = arr[i] + arr[i+1];

        }
    }
}
