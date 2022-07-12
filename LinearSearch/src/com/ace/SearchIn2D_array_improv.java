package com.ace;

import java.util.Arrays;

public class SearchIn2D_array_improv {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, 6, 4},
                {8, 7, 5, 35, 22},
                {6, 9, 4, 45}
        };
        int target = 6;
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        int target_row = -1;
        int target_col = -1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }

            }
        }
        return new int[]{-1};
    }
}


