package com.ace;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(9,27));
    }
    static int gcd(int a ,int b){
        if(a == 0){
            return b;
        }
        int rem = b%a;
        return gcd(rem,a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
