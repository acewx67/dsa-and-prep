package com.ace;

import java.util.Arrays;

public class Max_In_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, 6, 4},
                {8, 7, 5, 35,79, 22},
                {6, 9, 4, 45}
        };
        int target = 6;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }

            }
        }
        return max;
    }
}
