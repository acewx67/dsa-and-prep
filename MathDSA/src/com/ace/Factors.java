package com.ace;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 30240;
        factors(n);

    }
    // Complexity = O(n)
    static void factors(int n){
//        ArrayList<Integer> list = new ArrayList<>();
        int c =0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
                c++;
            }
        }
        System.out.println(c);
    }
    //Complexity = O(sqrt(n))
    static void factor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }

            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
