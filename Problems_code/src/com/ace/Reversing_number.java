package com.ace;

import java.util.Scanner;

public class Reversing_number {
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
            num = num / 10;
        }
        System.out.println("the number of digits in " + remember_num + " is = " + count);
        int last_dig = Integer.MIN_VALUE;
        int temp = 0;
        int answer = 0;
        while (remember_num > 0) {
            last_dig = remember_num % 10;
            remember_num = remember_num/10;
            temp = last_dig;
            for (int i = 1; i < count; i++) {
                temp = temp * 10;
            }
            answer = answer + temp;
            count--;
        }
        System.out.println("Reversed number is " + answer);
    }
}
