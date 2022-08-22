package com.ace;

public class CountZeros {
    public static void main(String[] args) {
        int n = 10302004;
        System.out.println(zeros(n));
    }
    static int count = 0;
    static int zeros(int n){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            ++count;
        }
        return zeros(n/10);
    }
}
