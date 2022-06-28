package com.ace;

import java.util.Scanner;

public class Reversing_number_KunalSoln {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rem = Integer.MIN_VALUE;
        int ans = 0;
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
