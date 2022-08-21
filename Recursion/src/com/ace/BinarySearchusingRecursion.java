package com.ace;

public class BinarySearchusingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 2 ;
        int ans = binarysearch(arr,target,0,arr.length-1);
        System.out.println(ans);


    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }

       int mid = (start+end)/2;
       if(arr[mid] == target){
           return mid;
       }
       if(arr[mid] > target){
          return binarysearch(arr,target,start,mid - 1);  //have to use return when calling the func coz,func has a value(here int) that needs to be returned
       }
       else{
           return binarysearch(arr,target,mid + 1,end);
       }
    }
}
