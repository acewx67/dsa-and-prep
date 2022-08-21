package com.ace;

import java.util.Arrays;

public class ShuffleBruteForce {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
            int j = 0;
            int[] temp = new int[2 * n];
            for (int i = 0; i < arr.length; i = i + 2) {
                temp[i] = arr[j];
                temp[i + 1] = arr[n + j];
                j++;

            }
            System.out.println(Arrays.toString(temp));

        }
    }
