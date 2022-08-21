package com.ace;

import java.util.Arrays;

public class Matrix_rotation {
    public static void main(String[] args) {
        int [][] arr = {
//                {0,0,0},
//                {0,1,0},
//                {1,1,1}
                {0,1},
                {1,1}
        };
        int [][]target = {
//                {1,1,1},
//                {0,1,0},
//                {0,0,0}
                {1,0},
                {0,1}
        };
        int i =0;
        boolean result = false;
        while(i < 4){   //as we can only see change in 4 increments of 90 degrees
            int[][]ans = rotate(arr);
            for (int j = 0; j < ans.length; j++) {
                for (int k = 0; k < ans.length; k++) {
                    if(ans[j][k] != target[j][k]){
                        ans = rotate(ans);
                    }
                    else{
                        result = true;
                    }
                    i++;
                }
            }
        }
        System.out.println(result);

    }

    static int[][] rotate(int[][] arr) {
        int [][] ans = new int[arr.length][arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {     //last row starting becomes column

            for (int j = 0; j < arr[i].length; j++) {
                ans[j][k] = arr[i][j];
            }
            k++;
        }
        return ans;
    }
}
