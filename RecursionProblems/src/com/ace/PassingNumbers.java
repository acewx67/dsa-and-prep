package com.ace;

public class PassingNumbers {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);   //in this first n as it is,is passed to fun THEN n=n-1 is performed,this gives STACKOVERFLOW error
        fun(--n); // in this first n = n-1 is done THEN n is passed to fun, this works perfectly
    }
}
