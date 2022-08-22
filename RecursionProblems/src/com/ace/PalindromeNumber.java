package com.ace;
//after we reverse a number,it will be same as input number if it is a palindrome
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }
    //after we reverse a number,it will be same as input number if it is a palindrome
    static int rev(int n){
        int digits = (int)Math.log10(n) + 1;
        return helper(digits,n);
    }
    private static int helper(int digits,int n){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(digits-1,n/10);
    }
    static boolean palindrome(int n){
        return n==rev(n);
    }
}
