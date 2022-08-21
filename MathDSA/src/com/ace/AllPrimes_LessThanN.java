package com.ace;

import java.util.ArrayList;

public class AllPrimes_LessThanN {
    public static void main(String[] args) {
        int n = 40;
        if(n <= 1){
            System.out.println("not prime");
        }
        allPrimes(n);

    }
    static void allPrimes(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n ; i++) {

            int c = 2;
            boolean prime = true;
            while (c * c <= i) {//wkt c <= srqrt(n) , so just square on both sides, gives us cleaner code

                if (i % c == 0) {
                    prime = false;
                    break;
                } else c++;
            }
            if(prime) {
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
