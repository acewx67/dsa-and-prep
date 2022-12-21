package com.ace;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(happy(3));
    }
    static boolean happy(int n){
        int sum = 0;
        int i = 0;
        while(i < 100){
            if(n <= 0){
                n = sum;
                sum = 0;
            }
            if(n > 0 && n < 10){
                sum += n*n;
            }
            else {
                sum += ((n % 10) * (n % 10));
            }
            if(sum == 1){
                return true;
            }
            n /= 10;
            i++;

        }
        return false;
    }
}
