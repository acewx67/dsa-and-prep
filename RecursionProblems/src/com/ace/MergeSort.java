package com.ace;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
//
//        mergesortINplace(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[]arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int []left = mergeSort(Arrays.copyOfRange(arr,0,mid)); //mid is excluded so we add it in other array
        int []right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int [] merge(int[]first,int[]second){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int [first.length + second.length];

        while(i < first.length && j < second.length ){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //IT MAYBE POSSIBLE THAT ONE OF THE ARRAYS IN NOT FINISHED
        //COPY REMAINING ELEMENTS INTO THE MIX ARRAY



//        if(i < first.length){
//            for (int l = i; l < first.length; l++) {
//                mix[k] = first[l];
//                k++;
//            }
//        }
//        if (j < second.length){
//            for (int l = j; l < second.length; l++) {
//                mix[k] = second[l];
//                k++;
//            }
//        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }



    static void mergesortINplace(int [] arr,int start,int end){
        int mid = start + (end-start)/2;
        if(start == mid && end == mid ){
            return;

//            UNCOMMENT TOGETHER
//            return new int [] {arr[mid]};
        }
        mergesortINplace(arr,start,mid);
        mergesortINplace(arr,mid+1,end);
        mergeInplace(arr,0,end);
//WE CAN ALSO USE THIS STATEMENT
//        return merge(mergesortINplace(arr,start,mid),mergesortINplace(arr,mid+1,end));
    }
    private static void mergeInplace(int []arr,int start,int end){
        int [] result = new int[end-start];
        int mid = start + (end-start)/2;
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                result[k] = arr[i];
                i++;
            }
            else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            result[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            result[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < result.length; l++) {
            arr[start+l] = result[l];
        }

    }
}
