package com.ace;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String temp = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(Palin(temp.toLowerCase(),0,temp.length()-1));
    }
    //using 2 pointer method to solve
    static boolean Palin(String str,int p,int q){
        if(p > q){
            return true;
        }
        if(str.charAt(p) != str.charAt(q)){
            return false;
        }
        else return Palin(str,p+1,q-1);
    }
}
