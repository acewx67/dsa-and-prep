package com.ace;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,4,56,76,89};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = 0;
        temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
