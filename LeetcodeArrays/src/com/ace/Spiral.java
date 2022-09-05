//package com.ace;
//
//import java.util.ArrayList;
//
//public class Spiral {
//    public static void main(String[] args) {
//        int [][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(spiral(arr));
//    }
//    static ArrayList<Integer> spiral(int [][]arr){
//        int start_row = 0;
//        int last_row = arr.length-1;
//        int last_col = arr[0].length-1;
//        int first_col = 0;
//        int col_limit1 = arr.length;
//        int col_limit2 = arr.length;
//        ArrayList<Integer> list = new ArrayList<>();
////        start_row != last_row || first_col != last_col
//        while() {
//            for (int l = 0; l < arr[0].length; l++) {  //get all the first row's elements
//                list.add(arr[start_row][l]);
//            }
//            start_row++;
//            col_limit1--;
//            for (int k = 1; k < col_limit2; k++) {  //get all the last column's elements
//                list.add(arr[k][last_col]);
//            }
//            last_col--;
//            for (int j = arr[0].length-1-1; j >=0 ; j--) {  //get the last row's elements in REVERSE
//                list.add(arr[last_row][j]);
//            }
//            last_row--;
//            col_limit2--;
//            for (int i = 1; i < col_limit1; i++) {   //get the first col's elements
//                list.add(arr[i][first_col]);
//            }
//            first_col++;
//        }
//        return list;
//    }
//}
