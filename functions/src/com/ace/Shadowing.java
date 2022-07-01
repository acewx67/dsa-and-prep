package com.ace;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        num();
    }

    static void num() {
        System.out.println(x);
    }
}
