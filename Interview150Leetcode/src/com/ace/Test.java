package com.ace;

import java.util.*;
////DIS IS COMPLEX AF
//NOT ALL TEST CASES PASSED
public class Test {
    public static void main(String[] args) {
        int [] arr = {4,1,-1,2,-1,2,3};
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j)+ 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println(map);
        List<Integer> [] bucket = new ArrayList[arr.length + 1];  //plus one coz edge case of single digit array like [1]

        for (int key:
                map.keySet()) {
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
                bucket[frequency].add(key);
            }
            else {
                bucket[frequency].add(key);
            }
            System.out.println(bucket[frequency]);

        }
        for (List<Integer> n:
             bucket) {
            System.out.print(n);
        }
        System.out.println();

        List<Integer> res = new ArrayList<>();

        for (int i = bucket.length-1; i >= 0 ; i--) {
            if(bucket[i] != null){
                res.addAll(bucket[i]);
                k--;
                if(k == 0) break;
            }
        }
        System.out.println(res);
        int [] ans = new int [res.size()];
        int ans_in = 0;
        for(int n : res){
            ans[ans_in] = n;
            ans_in++;
        }
        System.out.println(Arrays.toString(ans));


    }
}
