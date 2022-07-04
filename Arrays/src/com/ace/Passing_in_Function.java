package com.ace;

import java.util.Arrays;

public class Passing_in_Function {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,23};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
