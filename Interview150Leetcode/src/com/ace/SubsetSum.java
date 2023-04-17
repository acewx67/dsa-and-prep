package com.ace;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        int [] arr = {4,1,5,2,3,6};
        int n = 10;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            sum += arr[i];
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                temp.add(arr[j]);
                sum += arr[j];
                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    list.add(temp);
                    break;
                }
                
            }
        }
        System.out.println(list);
    }
}
