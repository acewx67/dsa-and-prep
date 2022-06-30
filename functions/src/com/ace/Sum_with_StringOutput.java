package com.ace;

import java.util.Scanner;

public class Sum_with_StringOutput {
    public static void main(String[] args) {
        String result = Sum();
        System.out.println(result);
    }
    static String Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        String result = "answer is = " + sum;
        return result;
    }
}
