package com.ace;

public class PositionOfanElement_InfiniteArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,23,34,45,56,67};
        int target = 4;
        System.out.println(infiniteSearch(arr,target));
    }

    static int infiniteSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(arr[end] < target){        //how to solve the outofbounds index error??!
                                        //how to solve the case when end gets greater than the array size???
            start = end + 1;
            end *= 2;
        }
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