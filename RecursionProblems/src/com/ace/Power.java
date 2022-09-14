package com.ace;

public class Power {
    public static void main(String[] args) {
        int x = 2;
        int n = 24;
//        System.out.println(power(x,n));
        System.out.println(logarthmic(2,24));
    }
    static int power(int x,int n){
        if(n == 1){
            return x;
        }
        return x * power(x,n-1);
    }
    static int logarthmic(int x,int n){
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return logarthmic(x,n/2) * logarthmic(x,n/2);
        }
        else{
            return logarthmic(x,n/2) * logarthmic(x,n/2) * x;
        }
    }
}
