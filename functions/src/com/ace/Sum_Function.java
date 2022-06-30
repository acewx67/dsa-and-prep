package com.ace;

import java.util.Scanner;

public class Sum_Function {
    public static void main(String[] args) {
        int ans = Sum();
        System.out.println(ans);
    }
    static int Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
