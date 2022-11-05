package com.ace.medium;

import java.util.HashMap;
import java.util.*;
//3SUM
public class Sum3 {
    public static void main(String[] args) {
        int [] arr = {0,0,0,0};
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int l = i+1;
            int r = arr.length-1;
            while(l < r){
                if(arr[l] + arr[r] == -1*arr[i]){
                    temp.add(arr[i]);
                    temp.add(arr[l]);
                    temp.add(arr[r]);
                    break;
                }
                else if(arr[l] + arr[r] < -1*arr[i]){
                    l++;
                }
                else r--;
            }
            if(!temp.isEmpty()) {
                list.add(temp);
                row++;
            }
        }
        System.out.println(list);
    }
}
