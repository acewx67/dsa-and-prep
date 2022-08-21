package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class Kids_candies {
    public static void main(String[] args) {
        int []arr = {2,3,5,1,3};
        int extracandies = 3;
        ArrayList<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }
        for (int i =0;i< arr.length;i++) {
            if((arr[i] + extracandies) >= max){
                result.add(true);
            }
            else {
                result.add(false);
            }

        }
        System.out.println(result);
    }
}
