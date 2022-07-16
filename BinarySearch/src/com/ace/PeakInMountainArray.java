package com.ace;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int []arr = {1,2,7,10,11,12,13,5,0};
        System.out.println(peak(arr));
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
}
