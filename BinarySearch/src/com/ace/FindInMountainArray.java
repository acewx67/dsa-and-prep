package com.ace;

public class FindInMountainArray {
    public static void main(String[] args) {
        /* we know that if we get the peak element position we know that at the peak ascending order ends
        and descending order begins,so we can use ascending order Binarysearch for before peak
        and descending order BS after peak.
         */
        int []arr = {1,3,7,9,5,2,0};
        int target = 2;
        int peake = peak(arr);
        System.out.println("peak is at " + peake);
        System.out.println("Target is at " + BinarySearch(arr,peake,target));


    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int ans = 0;  //position of peak

        while (start < end) {
            mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){   //mid is in decreasing part of array
                ans = mid;
                end = mid;
            }
            if(arr[mid] < arr[mid+1]){//mid is in increasing part of array
                ans = mid+1;
                start = mid +1;
            }
//            if(start==mid ){
//                start = end;
//            }
//            if(end==mid){
//                end = start;
//            }
        }
        return ans;
    }
    static int BinarySearch(int[] arr,int peake, int target) {
        int start = 0; //For ascending order of array
        int end = peake;
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
        start = peake+1;  //For descending order of array
        end = arr.length-1;
        mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                end = mid-1;
            }
            if (arr[mid] > target) {
                start = mid+1;
            }
        }
        return -1;
    }
}
