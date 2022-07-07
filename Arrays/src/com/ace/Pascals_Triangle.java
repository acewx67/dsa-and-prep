package com.ace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of pascal stages
        pascal(n);

        
    }

    static void pascal(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        //initialization
        for(int i=0;i< n;i++){
            list.add(new ArrayList<>());  //creating n arraylists,important
        }
        list.get(0).add(1); //1st stage is always 1
        //add elements
        for (int i = 1; i < 3; i++) {
                //similar to 2D array
                list.get(i).add(1);
                list.get(i+1).set(n-1,1);
        }
        System.out.println(list);

    }
}
