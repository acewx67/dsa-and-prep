package com.ace;

public class Method_overloading {
    public static void main(String[] args) {
        func(10);
        func("Hello");
    }

//             program knows which "func" to call,how?
//                                      during compile time,it knows which func is taking int,and which is taking string
    static void func(int a) {
        System.out.println(a);
    }
    static void func(String greeting){
        System.out.println(greeting);
    }
}
