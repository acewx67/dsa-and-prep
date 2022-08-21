package com.ace;

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        int []ans = small(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] small(int[]arr){
        int [] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    count++;
                }
                ans[i] = count;
            }


        }
        return ans;
    }
}
