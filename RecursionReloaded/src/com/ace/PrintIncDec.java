package com.ace;

public class PrintIncDec {
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
    }
    static void print(int start,int n){
        if(start > n){
            return;
        }
        System.out.print(start+" ");
        print(start+1,n);
        System.out.print(start+ " ");

    }
}
