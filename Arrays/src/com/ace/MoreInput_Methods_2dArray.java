package com.ace;

import java.util.Arrays;
import java.util.Scanner;

public class MoreInput_Methods_2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for(int i=0; i<arr.length; i++){   //arr.length gives us number of rows the 2D array has
            for(int j=0; j<arr[i].length; j++){  //arr[i].length gives us number of elements in that array ,or no. of columns
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i])); //or just write this one line instead of another for loop

        }

    }
}
