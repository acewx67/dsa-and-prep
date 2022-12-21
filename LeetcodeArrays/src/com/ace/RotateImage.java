package com.ace;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = 3;
        int [] nums = new int[n];
        int j = 0;
        int t = 0;
        for (int i = n-1; i >=0 ; i--) {
            for (int k = 0; k < n; k++) {
                nums[k] = arr[t][k];
            }
            t++;
            System.out.println(Arrays.toString(nums));
        }
    }

}
