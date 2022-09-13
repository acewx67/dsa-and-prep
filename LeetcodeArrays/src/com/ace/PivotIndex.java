package com.ace;

public class PivotIndex {
    public static void main(String[] args) {
        int [] arr = {2,1,-1};
        System.out.println(pivot(arr));
    }
    static int pivot(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int left_sum = 0;
            int right_sum = 0;
            if(i > 0) {
                for (int j = 0; j < i; j++) {
                    left_sum += arr[j];
                }
            }
            for (int j = i+1; j < arr.length; j++) {
                right_sum += arr[j];
            }
            if(left_sum == right_sum){
                return i;
            }
        }
        return -1;

    }
}
