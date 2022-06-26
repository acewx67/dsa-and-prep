package com.ace;

import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt(); //number
        int remember_num = num;
        int last_digit = Integer.MIN_VALUE;
        int count = 0;
        while (num > 0) {
            last_digit = num % 10;
            count++;
            num = num/10;
        }
        System.out.println("the number of digits in " + remember_num + " is = " + count);
    }
}
