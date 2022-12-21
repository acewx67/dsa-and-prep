package com.ace;

import java.util.Arrays;

//public class MergeSortINPLACE {
//    public static void main(String[] args) {
//        int [] arr = {4,3,2,1};
//
//    }
//    static void mergesort(int [] arr,int s,int e){
//        if(s - e == 1) {
//            return;
//        }
//        int mid = arr.length/2;
//        int left = mergesort(arr,0,mid);
//        int right = mergesort(arr,mid+1, arr.length-1);
//        merge(left,right);
//    }
//    static int [] merge(int i1, int i2){
//        int [] ans = new int [arr1.length + arr2.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i < arr1.length && j < arr2.length) {
//            if (arr1[i] < arr2[j]) {
//                ans[k] = arr1[i];
//                i++;
//                k++;
//            }
//            else {
//                ans[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//        if(j < arr2.length){
//            while(j < arr2.length){
//                ans[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//        else if(i < arr1.length){
//            while(i < arr1.length){
//                ans[k] = arr1[i];
//                i++;
//                k++;
//            }
//        }
//        return ans;
//    }
//
//}
