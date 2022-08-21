package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_target {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0};
        int []index = {0,1,2,3,0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i],arr[i]);
        }
        System.out.println(list);
        int [] arrlist = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrlist[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arrlist));

    }
}
