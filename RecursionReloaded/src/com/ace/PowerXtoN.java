package com.ace;

public class PowerXtoN {
    public static void main(String[] args) {
//        int digs = (int)Math.log10(123)+1;
//        System.out.println(digs);
//        System.out.println(Math.pow(10,digs-1));;
//        System.out.println((int)Math.log10(2000));
        double x = 2;
        int n = -2;
        if(n > 0) {
            System.out.println(pow(x, n));
        }
        else{
            System.out.println(1/(pow(x,n)));
        }
    }
    static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double xpnb2 = pow(x,n/2);
        if(n % 2 == 0){
            return xpnb2 * xpnb2;
        }
        else{
            return x * xpnb2 * xpnb2;
        }
    }
}
