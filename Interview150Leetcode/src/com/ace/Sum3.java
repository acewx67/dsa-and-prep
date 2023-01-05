package com.ace;

import java.util.HashMap;
import java.util.*;

class Sum3{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] arr = {-1,0,1,2,-1,-4};
        for (int i = 0; i < arr.length; i++) {
            map.put(i,arr[i]);
        }
        System.out.println(map);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}