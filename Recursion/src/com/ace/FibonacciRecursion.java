package com.ace;

public class FibonacciRecursion {
    public static void main(String[] args) {
        fibo(5,0,1);//enter the nth fibonacci number
    }
    static void fibo(int n,int a,int b){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(a + " ");
        a = b;
        b = c;
        fibo(n-1,a,b);
    }
}
