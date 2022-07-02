package com.ace;

import java.util.Scanner;

public class Primenumber_with_Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        String ans = prime(num);
        System.out.println(ans);


    }

    static String prime(int num) {
        int n = 2;
        String isPrime = num + " is a prime number.";
        String notPrime = num + " is NOT a prime number.";
        if(num <= 1){           //1 is not a prime number
            return notPrime;
        }
       double sqrt_of_num = Math.sqrt(num);
        while(n <= sqrt_of_num){
            if(num % n == 0){
                return notPrime;
            }
            n++;
        }
        return isPrime;
    }
}
