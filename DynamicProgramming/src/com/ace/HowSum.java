package com.ace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> memo = new HashMap<>();
        System.out.println(howsum(300,0,new int[] {7,14},list,memo));
    }
    static ArrayList<Integer>howsum(int targetSum,int n,int [] arr,ArrayList<Integer> list, Map<Integer,Integer> memo){
        if(memo.containsKey(targetSum)){
            return null;
        }
        if(targetSum == 0){
            return new ArrayList<>();
        }
        if(targetSum < 0){
            return null;
        }
        for(int num : arr){
            int remainder = targetSum-num;
            if(howsum(remainder,num,arr,list,memo) != null){
                list.add(num);
                return list;
            }
        }
        memo.put(targetSum,null);
        return null;
    }
}
