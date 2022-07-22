package com.ace;

import java.util.Arrays;

public class RBS_withDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4, 5,5,5,5,5, 6, 1, 2,3};
        int target = 5;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));
        int target_pos = search(arr,target);
        int[] ans = occurencee(arr,target,target_pos);
        System.out.println(Arrays.toString(ans));
    }
    static int[] occurencee(int[] arr, int target, int target_pos) {
        int firstOcc = target_pos; //there maybe a case where the 1st found value is the first and last occurence.
        int lastOcc = target_pos;
        int start = 0;
        int end = target_pos -1;
        int mid = 0;
        while (start <= end) {  //to get first occurence
            mid = (start+end)/2;
            if(arr[mid] == target){
                firstOcc = mid;
                end = mid -1;
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        start = target_pos+1;
        end = arr.length-1;
        while (start <= end) {  //to get last occurence
            mid = (start+end)/2;
            if(arr[mid] == target){
                lastOcc = mid;
                start = mid+1;
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        return new int[]{firstOcc,lastOcc};
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
