package com.ace;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitprod(1234));
    }
    static int digitprod(int n){
        if(n%10 == n){
            return n;
        }
//        can also use this,thought up by me
//        if(n == 0){
//            return 1;
//        }
        return (n%10) * digitprod(n/10);
    }
}
