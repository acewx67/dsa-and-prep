package com.ace;

import java.util.Scanner;

public class Multi_Dimension_Array {
    public static void main(String[] args) {
////        int[][] arr = new int[3][]; //important to mention row size
//        int[][] arr2d = {
//                {1, 2, 3},
//                {45, 23, 67, 8},
//                {1, 5, 7}
//        };
//        System.out.print(arr2d[0][1]); //gives index 1 position element of 0th array

        int[][] arr = new int[3][2]; //important to give both row and column size,else ERROR
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {   //arr.length gives us number of rows the 2D array has
            for (int j = 0; j < arr[i].length; j++) {  //arr[i].length gives us number of elements in that array ,or no. of columns
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println(); //print a new line after completing a row
        }
        }
    }

