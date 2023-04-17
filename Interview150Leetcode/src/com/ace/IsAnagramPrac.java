package com.ace;

import java.util.Arrays;

public class IsAnagramPrac {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char [] se = s.toCharArray();
        char []te = t.toCharArray();
        Arrays.sort(se);
        Arrays.sort(te);
        System.out.println(Arrays.toString(se));
//        return se.equals(te);

        int [] n = {1,2};
        int [] q = {1,2};
        System.out.println(Arrays.equals(n,q));

    }
}
