package com.ace;

public class Prob {
    public static void main(String[] args) {
        int [] arr = {1,3,9,10};
        System.out.println(bs(0, arr.length-1,arr,4));
    }
    static int bs(int s,int e,int [] arr,int target) {
        int mid = (s+e)/2;
        if (s > e) {
            return s;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bs(mid + 1, e, arr, target);
        } else {
            return bs(0, mid - 1, arr, target);
        }
    }

}

