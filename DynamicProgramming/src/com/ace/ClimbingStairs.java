package com.ace;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        Map<Integer,Integer> memo = new HashMap<>();
        System.out.println(countt(n,memo));
    }
    static int countt(int n,Map<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n == 2){
            return 2;
        }
        if(n==1){
            return 1;
        }
        int ans = countt(n-1,memo) + countt(n-2,memo);
        memo.put(n,ans);
        return ans;
    }
}
