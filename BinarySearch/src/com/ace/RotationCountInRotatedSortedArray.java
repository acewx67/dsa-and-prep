package com.ace;

public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(findPivot(arr));
        int pivot = findPivot(arr);
        if(pivot<arr[0]){
            System.out.println("not a sorted rotated array");
        }
        else System.out.println("number of rotations are = " + rotation_count(arr,pivot));
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
    static int rotation_count(int []arr,int pivot){
        int count = pivot + 1;
        return count;
    }
}
