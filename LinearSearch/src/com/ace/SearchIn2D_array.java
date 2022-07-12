package com.ace;

public class SearchIn2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, 6, 4},
                {8, 7, 5, 35, 22},
                {6, 9, 4, 45}
        };
        int target = 6;
        search(arr,target);
    }

    static int search(int[][] arr, int target) {
        int target_row = -1;
        int target_col = -1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    System.out.println(target + "'s position is " + row +','+col);
                }

            }
        }
        return -1;
    }
}
