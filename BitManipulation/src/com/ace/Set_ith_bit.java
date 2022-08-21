package com.ace;

import java.util.Scanner;

public class Set_ith_bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int num = 10;
        int ans = num | (1 << (n-1));
        System.out.println(ans);
    }
}
