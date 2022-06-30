package com.ace;

public class Function_with_Parameters {
    public static void main(String[] args) {
        String greet = Greeting("Ashfaq");
        System.out.println(greet);

    }

    static String Greeting(String name) {
        String str = ("hello " + name);
        return str;

    }

}
