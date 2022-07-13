package com.ace;

import java.util.Arrays;

public class Binary_Search {

    public static void main(String[] args) {
	int [] arr = {2,4,6,9,11,12,14,20,36,48};
    int target = 12;
    System.out.println(BinarySearch(arr,target));


    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        return -1;
    }
}
