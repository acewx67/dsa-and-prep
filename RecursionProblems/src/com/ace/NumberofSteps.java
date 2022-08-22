package com.ace;

public class NumberofSteps {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(steps(n));
    }
    static int steps(int n){
        return helper(n,0);
    }
    private static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%2 == 0){
            return helper(n/2,count+1);
        }
        else return helper(n-1,count+1);
    }
}
