package com.ace;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(ProdDigs(1342));
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    static int sumDigs(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumDigs(n/10);
    }
    static int ProdDigs(int n){
        if(n == 0){
            return 0;
        }
        if(n/10 == 0){
            return 1;
        }
        int prod = n%10 * ProdDigs(n/10);
        return prod;
    }

}
