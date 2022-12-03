package com.ace;

import java.util.ArrayList;
import java.util.*;

public class SubsetsArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();


        for (int sp = 0; sp < arr.length; sp++) {
            for (int ep = sp; ep < arr.length; ep++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = sp; i <= ep; i++) {
                    temp.add(arr[i]);
                }
                list.add(temp);
            }
        }
        System.out.println(list);

    }
}
