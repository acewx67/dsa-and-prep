package com.ace;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3,4};
        int target = 8;
        System.out.println(RBS(arr,target,0,arr.length-1));
    }
    static int RBS(int []arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] < target && arr[mid] > target){
            return RBS(arr,target,start,mid-1);
        }

        return RBS(arr,target,mid+1,end);

    }
}
