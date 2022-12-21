package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
        };
        int m = 5;
        int n = 5;
        int [] ans = new int [m*n];
        int size = 0;


        int index = 0;
        int start_row = 0;
        int last_col = arr[0].length-1;
        int last_row = m-1;
        int first_col = 0;


        while(size < m * n){
            //traverse first row
            for (int i = first_col; i <= last_col; i++) {
                ans[index] = arr[start_row][i];
                index++;
                size++;
                if(size >= m*n) break;
                //if size > m * n break whole loop
            }
            if(size >= m*n) break;
            start_row++;
            //traverse last column
            for (int j = start_row; j < last_row; j++) {
                ans[index] = arr[j][last_col];
                index++;
                size++;
                if(size >= m*n) break;
            }
            if(size >= m*n) break;
            last_col--;
            //traverse last row in reverse
            for (int k = last_col+1; k >= first_col ; k--) {
                ans[index] = arr[last_row][k];
                index++;
                size++;
                if(size >= m*n) break;
            }
            if(size >= m*n) break;
            last_row--;
            //traverse first col
            for (int l = last_row; l >= start_row; l--) {
                ans[index] = arr[l][first_col];
                index++;
                size++;
                if(size >= m*n) break;

            }
            if(size >= m*n) break;
            first_col++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
//[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
//[1, 2, 3, 4, 8, 12, 11, 10, 9, 6, 7, 7]