package com.ace;

import java.util.Arrays;

public class Binary2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 3;
        int[] rows_range = DownsizedMatrix(arr,target);
        System.out.println(Arrays.toString(rows_range));
        int start = rows_range[0];
        int end = rows_range[1];
//        BinarySearch(arr,)
    }
    static int BinarySearch(int[] arr, int target,int start, int end, int []rows_arr) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int[] DownsizedMatrix(int[][] arr, int target) {
        int mid_col = (arr.length)/2;
        int mid_col_mid= (arr[0].length)/2;  //this gives us mid ROW number
        if(arr[mid_col_mid][mid_col] < target){
            return new int[]{0,mid_col_mid};
        }
        if (arr[mid_col_mid][mid_col] > target){
            return new int[]{mid_col_mid,arr.length};
        }
        return new int[]{mid_col_mid,mid_col};
    }
//    static int mid(int[][]arr){
//        int mid_col = (arr.length)/2;
//        int mid_col_mid= (arr[0].length)/2;
//        if(arr[mid_col_mid][mid_col_mid] >)
//    }

}
