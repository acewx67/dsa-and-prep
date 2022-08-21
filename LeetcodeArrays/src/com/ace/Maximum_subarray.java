package com.ace;

public class Maximum_subarray {
    public static void main(String[] args) {
//        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     max += arr[i];
        // }
        // if(arr[arr.length-1] > max){
        //     max = arr[arr.length-1];
        // }
        // if(arr[0] > max){
        //     max = arr[0];
        // }
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum > max){
                max = sum;
            }
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
