package com.ace;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] a = {10,1};
        change(a);
        System.out.println(Arrays.toString(a));

    }

    static void change(int[] typo) {
        typo[0] = 20;
    }
}
