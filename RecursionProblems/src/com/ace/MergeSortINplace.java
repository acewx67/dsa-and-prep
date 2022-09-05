package com.ace;

import java.util.Arrays;

public class MergeSortINplace {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesort(int[]arr,int start,int end){
        int mid = start + (end-start)/2;
        if(end - start == 1 ){
            return;
        }
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    private static void merge(int []arr,int start,int mid,int end){
        int [] temp = new int [end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        while(i < mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < temp.length; l++) {
            arr[start+l] = temp[l];
        }
    }
}
