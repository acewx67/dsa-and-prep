package com.ace;

import java.util.ArrayList;

public class BestSum {
    public static void main(String[] args) {
        int [] arr = {2,3,5};
        int target = 8;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(best(arr,target,0,temp,list));
        System.out.println(list);
    }
    static ArrayList<Integer> best(int [] arr,int target,int num,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list){
        if(target == 0){
            return new ArrayList<>();
        }
        if(target < 0){
            return null;
        }
        for (int j : arr) {
            int remainder = target - j;
            if (best(arr, remainder, j, temp, list) != null) {
                temp.add(j);
                list.add(temp);
            }


        }
        if(temp != null) list.add(temp);
        return null;
    }
}
