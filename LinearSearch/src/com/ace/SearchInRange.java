package com.ace;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {1,7,56,45,-3,89,0};
        int target = -3;
        int start = 1;
        int end = 5;
        System.out.println(search(arr,target,start,end));
    }

    static int search(int []arr, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;  //returns this if target not found in given range
    }
}
