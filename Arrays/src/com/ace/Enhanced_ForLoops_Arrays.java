package com.ace;

import java.util.Arrays;
import java.util.Scanner;

public class Enhanced_ForLoops_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [5];
        for(int i = 0; i < arr.length; i++){   //input
            arr[i] = in.nextInt();
        }
        for(int num : arr){
            System.out.print(num + " ");   //enhanced for loop for printing
        }

        //also we can use
        System.out.println(Arrays.toString(arr));  //just one line instead of using a for loop
    }
}
