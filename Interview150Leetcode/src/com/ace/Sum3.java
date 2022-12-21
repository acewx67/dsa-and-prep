//package com.ace;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Sum3 {
//    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<String,Integer>();
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        int [] arr = {1,2,3,4};
//
//        for (int i = 0; i < arr.length; i++) {
//            String in = i + "";
//            for (int j = 0; j < arr.length && j != i; j++) {
//                String jn = j + "";
//                map.put(jn + "," + in,arr[i] + arr[j]);
//            }
//        }
//        System.out.println(map);
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsValue(-1*arr[i])) map.containsKey()
//        }
//    }
//}
