package com.ace;

import java.util.Arrays;

public class ChangeValue_int {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);

    }

    static void change(int typo) {
        typo = 20;
    }
}
