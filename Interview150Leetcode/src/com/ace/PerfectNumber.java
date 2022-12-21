package com.ace;

import java.util.HashMap;
import java.util.Map;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28 ;
        System.out.println(perf(num));
    }
    static boolean perf(int num){
        int sum = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=2;i < num;i++){
            if(num % i == 0){
                int frac = num/i;
                if(map.containsKey(i)) break;
                map.put(frac,i);
                sum += i;
                sum += num/i;
            }
        }
        return sum == num;
    }
}
