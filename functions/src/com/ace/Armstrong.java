package com.ace;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        String ans = Arms(num);
        System.out.println(ans);
    }

    static String Arms(int n) {
        int number = n;
        String isArmstrong = n + " is an Armstrong number";
        String notArmstrong = n + " is NOT an Armstrong number";
        int last_digit = Integer.MIN_VALUE;
        int cubed_val = 0;
        int sum = 0;
        while(n > 0){
            last_digit = n % 10;
            cubed_val = last_digit * last_digit * last_digit;
            sum += cubed_val;
            if(sum == number){
                return isArmstrong;
            }
            n /= 10;
        }
        return notArmstrong;

    }
}
