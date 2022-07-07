package com.ace;

import java.util.Arrays;

public class Set_matrix_zero_improved {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        setzero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

    }

    static void setzero(int[][] arr1) {
        int[] row_pos = {-1, -1, -1, -1};
        int[] col_pos = {-1, -1, -1, -1};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {   //Finding the guilty(row) and accomplices(column)
                if (arr1[i][j] == 0) {
                    row_pos[i] = i;
                    col_pos[j] = j;
                }
            }
        }
        for (int i = 0; i < 2; i++) {        //row zeroing
            if(row_pos[i] != -1){
                for (int j = 0; j < 4; j++) {
                    arr1[i][j] = 0;

                }
            }
        }

        for (int i = 0; i < 4; i++) {    //column zeroing
            if(col_pos[i] != -1){
                for (int j = 0; j < 3; j++) {
                    arr1[j][i] = 0;

                }
            }

        }
    }
}

