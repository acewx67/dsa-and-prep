package com.ace;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        Map<Integer,Boolean> memo = new HashMap<>();
        System.out.println(cansum(300,new int []{7,14},memo));
    }
    static boolean cansum(int targetSum,int [] arr,Map<Integer,Boolean> memo){
        if(memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if(targetSum == 0){
            return true;
        }
        if(targetSum < 0){
            return false;
        }
        for (int n:
             arr) {
            if(cansum(targetSum - n, arr,memo)){
                memo.put(targetSum,true);
                return true;
            }
        }
        memo.put(targetSum,false);
        return false;
    }
}
