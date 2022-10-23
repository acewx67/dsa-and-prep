package com.ace;

public class Main {

    public static void main(String[] args) {
//	printdec(5);
        System.out.println(steps(12,0));

    }
    static void printdec(int a){
        System.out.println(a);
        if(a==0){
            return;
        }
        printdec(a-1);
    }
    static int count(int n,int c){
        if(n/10 == n){
            return c;
        }
        if(n % 10 == 0){
            c++;
        }
        return count(n/10,c);
    }
    static int steps(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2 == 0){
            return steps(n/2,c+1);
        }
        else return steps(n-1,c+1);
    }
}
