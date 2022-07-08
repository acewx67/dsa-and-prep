package com.ace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of pascal stages
        System.out.println(Arrays.toString(pascal(n)));


    }

    static int[] pascal(int n) {
        ArrayList<Integer> list = new ArrayList<>(5);
        //initialization
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {       //generating pascal triangle containing only 1's
//                list.get(i).add(1);
//                list.get(i+1).set(n-1,1);
//        }
        int[] one = {1};
        if(n == 1){
            return one;
        }
        int [] previous = {1,1};


        for (int i = 2; i <= n ; i++) {
            int[] next = new int[i + 1];
            next[0] = 1;
            for (int j = 1; j < i; j++) {

                next[j] = previous[j - 1] + previous[j];
            }
            next[i] = 1;
            previous = next;

        }
        return previous;
//        for(int i=0;i< n;i++){
//            list.add(new ArrayList<>());  //creating n arraylists,important
//        }
//        if(n>=2){
//            list.add(0,1);
//            list.add(1,1);
//        }
//        System.out.println(list);





//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((list.get(i)));
//
//        }
    }
}
