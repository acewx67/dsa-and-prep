package com.ace;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int remove(int[] nums) {
        //k is no. of duplicates of all numbers
        int k = 0;
        int index = 0;
        int[] expect = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean condition = true;
            for (int j = i + 1; j <= nums.length; j++) {
                if (j < nums.length && nums[i] != 101 && nums[i] == nums[j]) {
                    k++;
                    nums[j] = 101;
                }
                if (condition && nums[i] != 101) {
                    expect[index] = nums[i];
                    index++;
                    condition = false;
                }
            }

        }

        for (int i = 0; i < expect.length; i++) {
            nums[i] = expect[i];
        }
        return k;
    }
}
