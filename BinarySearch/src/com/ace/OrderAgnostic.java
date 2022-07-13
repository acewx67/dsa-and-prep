package com.ace;

public class OrderAgnostic {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,7};
        int target = 5;
        if(arr[0] > arr[1]){
            System.out.println(Descending_BinarySearch(arr,target));
        }
        else System.out.println(BinarySearch(arr,target));
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

    static int Descending_BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                start = mid +1;
            }
            if(arr[mid] < target){
                end = mid -1;
            }
        }
        return -1;

    }
}
