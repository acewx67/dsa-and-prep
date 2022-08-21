package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2},
                {3,4}
        };
        int r = 2;
        int c = 4;
        if(arr.length*arr[0].length != r*c){
            //return arr;
            return;
        }
        int [][] ans = new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();
        for (int [] ar:
             arr) {
            for (int num:
                 ar) {
                list.add(num);
            }
        }
//        System.out.println(list);
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = list.get(k);
                k++;
            }
        }
        for (int[] ar:
             ans) {
            System.out.println(Arrays.toString(ar));
        }

    }
}
