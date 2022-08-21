package com.ace;

public class Reset_ith_bit {
    public static void main(String[] args) {
        int n = 4;
        int num = 10;
        int ans = num & ~(1 << (n-1));
        System.out.println(ans);
    }
}
