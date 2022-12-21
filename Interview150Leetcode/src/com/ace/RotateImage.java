package com.ace;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int n = 3;

        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//TRANSPOSING THE MATRIX
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
//REVERSE THE ROWS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }

        for (int [] t:
             arr) {
            System.out.println(Arrays.toString(t));
        }

    }
}
