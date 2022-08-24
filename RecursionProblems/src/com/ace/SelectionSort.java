package com.ace;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {4,3,7,2,1};
        selection(arr,0, arr.length-1,Integer.MIN_VALUE,-1);
        System.out.println(Arrays.toString(arr));
    }
    //we dont really need max_pos variable, just swap the max with the last element
    //we r OK if we just use arr,index,end,max as arguments
    static void selection(int [] arr,int index, int end,int max,int max_pos){
        if(end == 0){
            return;
        }
        if(index <= end){
            if(arr[index] > max){
                max = arr[index];
                max_pos = index;
            }
            selection(arr,index+1,end,max,max_pos);
        }
        else{
            swap(arr,max_pos,end);
            selection(arr,0,end-1,Integer.MIN_VALUE,max_pos);
        }



    }
    static void swap(int []arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
