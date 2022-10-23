package com.ace;

public class Powerof2 {
    public static void main(String[] args) {
        int n = 1073741825;
        System.out.println(pow(n,2));
    }
    static boolean pow(int n,int two){
        if(two > n){
            return false;
        }
        if(n == two){
            return true;
        }
        return pow(n,two * 2);
    }
}
