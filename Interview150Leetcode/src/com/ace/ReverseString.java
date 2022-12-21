package com.ace;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        rev(s);
        System.out.println(Arrays.toString(s));
    }
    static char [] rev(char [] s){
        int i = 0;
        while(i < s.length/2){
            swap(s,i,s.length-1-i);
            i++;
        }
        return s;
    }
    static void swap(char [] s,int a,int b){
        char t = s[a];
        s[a] = s[b];
        s[b] = t;
    }

}
