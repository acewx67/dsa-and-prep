package com.ace;

import static java.lang.Math.min;

public class Patterns {
    public static void main(String[] args) {
        Pattern31clone(4);
    }
    static void Pattern31clone(int n){
        int original_N = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {

            for (int column = 0; column <= n ; column++) {//what you want to print in the row
                int value_At_Everyindex = original_N - Math.min(Math.min(row,column),Math.min(n-row,n-column));  //just edit this formula

                System.out.print(value_At_Everyindex + "  ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }
    static void Pattern31(int n){
        n = 2*n;
        for (int row = 0; row <= n; row++) {

            for (int column = 0; column <= n ; column++) {//what you want to print in the row
                int value_At_Everyindex = Math.min(Math.min(row,column),Math.min(n-row,n-column)); //just edit this formula

                System.out.print(value_At_Everyindex + "  ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        // Diamond 123 Pattern
        for (int row = 1; row <= 2*n; row++) {
            int temp0 = row > n ? row-n : n-row;
            for (int i = 0; i < temp0; i++) {
                System.out.print(" ");  //print spaces
            }
            int temp = row > n ? 2*n - row : row;

//            for (int column = 1; column <= temp ; column++) {
//
//                System.out.print(column + " ");      //use previous diamond code as reference
//            }
            for (int column = temp; column > 1; column--) {

                System.out.print(column);
            }
            for (int column = 1; column <=temp; column++) {
                System.out.print(column);
            }
            //when a row is printed we need to add a new line

            System.out.println();
        }
    }

    static void Pattern30(int n) {
       //123 pyramid
        for (int row = 1; row <= n; row++) {

            for (int i = 0; i < n-row; i++) {
                System.out.print("  ");  //print spaces
            }

            for (int column = row; column > 1; column--) {

                System.out.print(column + " ");
            }
            for (int column = 1; column <=row; column++) {
                System.out.print(column + " ");
            }
            //when a row is printed we need to add a new line

            System.out.println();
        }
    }
    static void Pattern6(int n){
                // Diamond Pattern
        for (int row = 1; row <= 2*n; row++) {
            int temp0 = row > n ? row-n : n-row;
            for (int i = 0; i < temp0; i++) {
                System.out.print(" ");  //print spaces
            }
            int temp = row > n ? 2*n - row : row;

            for (int column = 1; column <= temp ; column++) {

                System.out.print("* ");
            }
            //when a row is printed we need to add a new line

            System.out.println();
        }
    }
    static void Pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int temp = row > n ? 2*n - row : row;
            for (int column = 1; column <= temp ; column++) {

                System.out.print("* ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row ; column++) {   //what you want to print in the row
                System.out.print(column +" ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int column = 1; column <= n-row ; column++) {   //what you want to print in the row
                System.out.print("* ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n ; column++) {   //what you want to print in the row
                System.out.print("* ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }
    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row ; column++) {   //what you want to print in the row
                System.out.print("* ");
            }
            //when a row is printed we need to add a new line
            System.out.println();
        }
    }

}
