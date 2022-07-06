package com.ace;

public class Find_MAX_inArray {
    public static void main(String[] args) {
        int[] arr = {1,3,76,88,55};
        int ans = largest(arr);
        System.out.println("The largest number is " + ans);
        System.out.println(maximum(arr,0,2));  //max in range of 0 to 3 index

    }

    static int largest(int[] arr1) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        return max;
    }
    static int maximum(int[] arr2,int start, int end){   //to find the maximum number in a range of index
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {

            if (arr2[i] > max){
                max = arr2[i];
            }
        }
        return max;
    }
}
