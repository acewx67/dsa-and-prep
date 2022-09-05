package com.ace;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr , int low, int high){
        if(low >= high ){
            return;
        }
        int s = low;
        int e = high;
        int p = s + (e-s)/2;  //taking pivot position as the mid

        while(s <= e){
            while(arr[s] < arr[p]){
                s++;
            }
            while(arr[e] > arr[p]){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now pivot is at correct index, sort the 2 halves

        sort(arr,low,e);
        sort(arr,s,high);
    }
}
