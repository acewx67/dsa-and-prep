package com.ace;

import java.util.Arrays;

public class Binary2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

//        int[] rows_range = DownsizedMatrix(arr,target);
////        System.out.println(Arrays.toString(rows_range));
//        int start = rows_range[0];
//        int end = rows_range[1];
////        BinarySearch(arr,)
    }
    static int[] BinarySearch(int[][] arr, int target,int row,int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[row][mid] == target) {
                return new int []{row,mid};
            }
            if (arr[row][mid] < target) {
                start = mid + 1;
            }
            if (arr[row][mid] > target) {
                end = mid - 1;
            }
        }
        return new int []{-1,-1};
    }

//    static int[] DownsizedMatrix(int[][] arr, int target) {
//        int mid_col = (arr.length)/2;
//        int mid_col_mid= (arr[0].length)/2;  //this gives us mid ROW number
//        if(arr[mid_col_mid][mid_col] < target){
//            return new int[]{0,mid_col_mid};
//        }
//        if (arr[mid_col_mid][mid_col] > target){
//            return new int[]{mid_col_mid,arr.length};
//        }
//        return new int[]{mid_col_mid,mid_col};
//    }
    static int[] search(int[][] arr,int target) {
        int row = arr.length;
        int col = arr[0].length;
        if (row == 1) {
            return BinarySearch(arr, target, 0, 0, col - 1);
        }
        int rStart = 0;
        int rEnd = arr.length - 1;   //or row - 1
        int cMid = col / 2;
        while (rStart < rEnd - 1) {  //using this condition cos we want to leave behind atleast 2 rows for the binary search
            int rMid = (rStart + rEnd) / 2;
            if (arr[rMid][cMid] < target) {
                rStart = rMid;
            } else rEnd = rMid;
        }
        //now we have 2 rows left
        //Check wether target is in mid column of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        //check 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return BinarySearch(arr, target, rStart, 0, cMid - 1);
        }
        //check 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][col - 1]) {
            return BinarySearch(arr, target, rStart, cMid + 1, col - 1);
        }
        //check 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return BinarySearch(arr, target, rStart + 1, 0, cMid - 1);
        }

        //check 4th half
        if (target >= arr[rStart + 1][cMid + 1] && target <= arr[rStart + 1][col - 1]) {
            return BinarySearch(arr, target, rStart + 1, cMid + 1, col - 1);
        }
        return new int[]{-1, -1};
    }





//        if(arr[row/2][col/2] < target){
//            return BinarySearch(arr,target,0,0,col/2);
//        }
//        else return BinarySearch(arr,target,row/2,col/2,col);
//
//    }
//    static int mid(int[][]arr){
//        int mid_col = (arr.length)/2;
//        int mid_col_mid= (arr[0].length)/2;
//        if(arr[mid_col_mid][mid_col_mid] >)
//    }

}
