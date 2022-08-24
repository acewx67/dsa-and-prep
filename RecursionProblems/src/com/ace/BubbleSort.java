package com.ace;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {4,3,2,1};
        bubble(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr, int index,int end){
        if(end == 0){
            return;
        }
        if(index < end && arr[index] > arr[index+1]){
            swap(arr,index,index+1);
            bubble(arr,index+1,end);
        }
        else if (index >= end){
            bubble(arr, 0, end-1);
        }
        else{
            bubble(arr,index + 1,end);
        }
    }
    static void swap(int []arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
