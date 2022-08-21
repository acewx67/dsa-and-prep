package com.ace;

public class NewtonSqrt {
    public static void main(String[] args) {
        int n = 600;
        System.out.println(sqrt(n));
    }
    static double sqrt(int n){
        double root = 0.0;
        double x = n;
        while(true){
            root = 0.5 * (x + (n/x));
            double error = Math.abs(root-x);
            if(error < 0.01){
                break;
            }
            else{
                x = root;
            }
        }
        return root;
    }
}
