package com.ace;

import java.util.Arrays;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setzero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

    }
    static void setzero(int[][]arr1){
        int row_pos = 0;
        int col_pos =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {   //Finding the guilty(row) and accomplices(column)
                if(arr1[i][j] == 0){
                    row_pos = i;
                    col_pos = j;
                }
            }
        }
        for (int i =0 ; i < arr1[row_pos].length; i++) {   //zeroing the guilty array
            arr1[row_pos][i] = 0;
        }
        for (int i = 0; i < arr1.length; i++) {    //zeroing the column accomplices
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[j][col_pos] = 0;

            }
        }
    }
}
