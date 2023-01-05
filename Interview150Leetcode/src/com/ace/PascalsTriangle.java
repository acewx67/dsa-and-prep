package com.ace;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j==i){
                    temp.add(1);
                }
                else{
                    temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(temp);
        }
        for (List<Integer> t:
             list) {
            System.out.println(t);
        }
    }
    static List<List<Integer>> list = new ArrayList<>();

}
