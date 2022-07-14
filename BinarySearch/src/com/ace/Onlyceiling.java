package com.ace;

public class Onlyceiling {    //this is for finding only greater element than target
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 14;
        System.out.println(ceiling1(arr,target));
    }

    static int ceiling1(int[] arr, int target) {   //must return the ceiling
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                return arr[mid+1];
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        return arr[start];

    }
}
