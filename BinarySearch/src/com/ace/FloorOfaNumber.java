package com.ace;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 11;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target) {   //must return the ceiling
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        return arr[end];

    }
}
