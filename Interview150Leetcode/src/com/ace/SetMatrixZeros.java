package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        //find positions of all zeros in matrix
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 0){
                    list.add(row);
                    list.add(col);
                }
            }
        }
        if(!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                //turning row into zeros
                for (int j = 0; j < arr[list.get(i)].length; j++) {
                    arr[list.get(i)][j] = 0;
                }
                i++;
                //turning col into zeros
                for (int k = 0; k < arr.length; k++) {
                    arr[k][list.get(i)] = 0;
                }
            }
            for (int[] ar :
                    arr) {
                System.out.println(Arrays.toString(ar));
            }
        }
    }
}
