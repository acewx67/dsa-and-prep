package com.ace;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr = {1,1,2,0};
        Arrays.sort(arr);
        if(BS(arr) == -1){
            System.out.println(1);
        }
        else System.out.println(answer(arr,BS(arr)));


    }


    static int BS(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == 1){
                return mid;
            }
            if(arr[mid] > 1){
                end = mid-1;
            }
            if(arr[mid] < 1){
                start = mid+1;
            }
        }
        return -1;
    }
    static int answer(int [] arr , int pos){
        for (int i = pos; i < arr.length-1; i++) {
//
            if(arr[i] != arr[i+1] && arr[i+1] != 1+arr[i] ){
                return arr[i] + 1;
            }
        }
        return arr[arr.length-1] + 1;
    }
}
