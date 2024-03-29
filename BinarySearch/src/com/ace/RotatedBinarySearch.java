package com.ace;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,0,1};
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1; 
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1; //if pivot is not returned in while loop
    }

    static int BinarySearch(int[] arr, int target,int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int search(int []arr,int target){
        int pivot = findPivot(arr);
        if(pivot== -1){
            //which means pivot not found,so array is not a rotated array
            //so do normal binary search
            return BinarySearch(arr,target,0, arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }
        //if pivot is found we have found 2 ascending orders
        if(target < arr[0]){
            return BinarySearch(arr,target,pivot+1,arr.length-1);
        }
        if(target >= arr[0]){   //include >= so to run 'if' target == start element
            return BinarySearch(arr,target,0, pivot-1); //pivot-1 coz ,if target was pivot it would be caught in first 'if' condition
        }
        return -1; //target not found in rotated-array
    }
}