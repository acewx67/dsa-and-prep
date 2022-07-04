package com.ace;

import java.util.Arrays;
import java.util.Scanner;

public class Input_Arrays {
    public static void main(String[] args) {
        int[] arr = new int [2];
        arr[0] = 5;
        arr[1] = 67;
        System.out.println(arr[0]);
        System.out.println(arr[1]); //this is one way of intialising an array.

        //one more efficient method:
        Scanner in = new Scanner(System.in);
        for(int i =0; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
    }

