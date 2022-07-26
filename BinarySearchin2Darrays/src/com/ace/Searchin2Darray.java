package com.ace;

import java.util.Arrays;
//this method will give " Index out of bound" error if target not found
public class Searchin2Darray {   //searching in sorted row-wise and column-wise

    public static void main(String[] args) {
	// write your code here
        int [][] arr = {
                {1,2,3,4,5},
                {8,9,11,14,27},
                {56,76,79,89,90}
        };
        int target = 99;
        int[] ans = Search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search2D(int[][] arr, int target) {
        int row=0;  //first row
        int col=arr[row].length-1;   //last column
        boolean target_not_found = true;
        while(target_not_found){         //this method will give out of bound error if target not found
            if(arr[row][col] == target){
                target_not_found = false;
                return new int []{row,col};
            }
            if(arr[row][col] > target){
                col--;
            }
            if(arr[row][col] < target){
                row++;
            }
        }
        return new int[]{-1}; //target not found
    }
}
