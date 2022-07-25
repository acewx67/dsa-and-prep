package com.ace;

public class RBS_DupElements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int target = 3;
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
            //if start==mid==end elements
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){  //check if start and end elements are not pivot
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if(arr[start] < arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1; //if pivot is not returned in while loop
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
}
