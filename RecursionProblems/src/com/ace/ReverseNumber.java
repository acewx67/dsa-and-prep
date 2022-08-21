package com.ace;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(rev2(12345));
//        System.out.println(sum);

    }
    static int sum = 0;
    static int rev(int n){
        if(n/10 == n){
            return n;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        return rev(n/10);
    }
    static int rev2(int n){
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
}
