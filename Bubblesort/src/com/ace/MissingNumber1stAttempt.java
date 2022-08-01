//package com.ace;
//
//import java.util.Arrays;
//
//public class MissingNumber {
//    public static void main(String[] args) {
//        int [] arr = {3,4,0,1,2};
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void missing(int[] arr){
//        int i = 0;
//        while(i < arr.length){
//            int correctIndexOfarr_i = arr[i];
////            if(arr[i] < arr.length && arr[i] != i ){
//            if(arr[i] != i){
//                int temp = arr[arr[i]];
//                arr[arr[i]] = arr[i];
//                arr[i] = temp;
//
//            }
////            else{
////                i++;
////            }
//            i++;
//        }
////        for (int index = 0; index < arr.length; index++) {
////            if(index != arr[index]){
////                return index;
////            }
////        }
////        return arr.length;
//    }
//    static void swap(int [] arr,int i,int correctIndexOfarr_i){
//        int temp = arr[i];
//        arr[i] = arr[correctIndexOfarr_i];
//        arr[correctIndexOfarr_i] = temp;
//    }
//}
