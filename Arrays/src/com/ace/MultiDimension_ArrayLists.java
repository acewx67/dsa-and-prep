package com.ace;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimension_ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //syntax

        //initialization
        for(int i=0;i< 3;i++){
            list.add(new ArrayList<>());  //creating 3 arraylists,important
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {    //similar to 2D array
                list.get(j).add(in.nextInt());

            }
        }
        System.out.println(list);
    }
}
