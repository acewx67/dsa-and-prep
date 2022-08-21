package com.ace;

public class Prime {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){    //wkt c <= srqrt(n) , so just square on both sides, gives us cleaner code
            if(n % c == 0){
                return false;
            }
            else c++;
        }
        return true;

    }
}
