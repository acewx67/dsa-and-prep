package com.ace;

import java.util.Arrays;

public class Searchin2D_kunal {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,5},
                {8,9,11,14,27},
                {56,76,79,89,90}
        };
        int target = 90;
        int[] ans = Search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search2D(int[][] arr, int target) {
        int row=0;  //first row
        int col=arr[row].length-1;   //last column
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int []{row,col};
            }
            if(arr[row][col] > target){
                col--;
            }
            if(arr[row][col] < target){
                row++;
            }
        }
        return new int[]{-1,-1}; //target not found
    }
}
