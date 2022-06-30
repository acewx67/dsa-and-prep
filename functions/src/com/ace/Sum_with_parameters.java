package com.ace;

public class Sum_with_parameters {
    public static void main(String[] args) {
        int result = sum(20,30);
        System.out.println(result);

    }

    static int sum(int a,int b) {
        int sum = a + b;
        return sum;
    }
}
