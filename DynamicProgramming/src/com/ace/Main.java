package com.ace;

import java.util.HashMap;
import java.util.Map;

public class Main {
//how to get value from key
//        map.put(1,1);
//        map.put(2,1);
//        map.put(3,2);
//        System.out.println(map.get(3));
    public static void main(String[] args) {
	    Map<Integer,Long> map = new HashMap<>();
        System.out.println(fib(50,map));



    }
    static Long fib(int n,Map<Integer,Long> map){
        if(n <=2){
            return 1L;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        else {
            long temp = fib(n-1,map)+fib(n-2,map);
            map.put(n,temp);
        }
        return map.get(n);


    }
}
