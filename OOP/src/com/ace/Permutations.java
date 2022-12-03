//package com.ace;
//
//import java.util.ArrayList;
//
//public class Permutations {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3};
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int n:
//             arr) {
//            list.add(n);
//        }
//    }
//    static ArrayList<ArrayList<Integer>> perm(int [] arr,ArrayList<Integer> list){
//        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> x = new ArrayList<>();
//        int i=0;
//
//        while(i < arr.length){
//
//            for (int j = 0; j < arr.length; j++) {
//                if(j == i){
//                    continue;
//                }
//                int [] t = new int[arr.length];
//                t =  arr;
//                swap(i,j,t);
//                for (int n:
//                     t) {
//                    x.add(n)
//                }
//            }
//            temp.add(x);
//
//        }
//    }
//
//
//    static void swap(int a,int b,int [] arr){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//}
