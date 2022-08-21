package com.ace;

import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int [][]arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        //reverse each row

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length-1;
            for (start = 0; start < end; start++) {
                int temp = arr[i][end];
                arr[i][end] = arr[i][start];
                arr[i][start] = temp;
                end--;

            }
        }
//        for (int []ar:
//             arr) {
//            System.out.println(Arrays.toString(ar));
//
//        }
        //inverting the row elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        for (int []ar:
                arr) {
            System.out.println(Arrays.toString(ar));

        }
    }
}
