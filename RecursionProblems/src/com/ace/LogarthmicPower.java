package com.ace;

public class LogarthmicPower {
    public static void main(String[] args) {
        int x = 2;
        int n = 30;
        System.out.println(logpower(x,n));


    }
    static int power(int x,int n ){
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }
    static int logpower(int x,int n ){

        int xpnb2 = power(x,n/2);
        if(n % 2 == 0){
            return xpnb2 * xpnb2;
        }
        else return xpnb2 * xpnb2 * x;

    }

}
