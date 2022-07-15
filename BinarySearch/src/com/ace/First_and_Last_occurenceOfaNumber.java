package com.ace;

import java.util.Arrays;

public class First_and_Last_occurenceOfaNumber {
    public static void main(String[] args) {
        int []arr = {5,7,7,7,7,8,8,10};
        int target = 9;
        int target_pos = BinarySearch(arr,target);
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

    static int BinarySearch(int[] arr, int target) {   //get the first found position
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
