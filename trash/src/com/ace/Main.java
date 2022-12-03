package com.ace;

public class Main {

    public static void main(String[] args) {
        System.out.println(gcd(183,91));
//        System.out.println(lcm(9,27));
        }
        static int gcd(int a ,int b){
            if(a == 0){
                return b;
            }
            int rem = b%a;
            return gcd(rem,a);
        }
    }
