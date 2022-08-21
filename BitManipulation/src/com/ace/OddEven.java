package com.ace;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(ifodd(66));
    }
    static boolean  ifodd(int n){
        return (n&1) == 1;
    }
}
