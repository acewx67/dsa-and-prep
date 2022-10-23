package com.ace;

public class ReverseANumber {
    public static void main(String[] args) {
//        int x = -123;
//        boolean neg = false;
//        if(x < 0){
//            x = -1 * x;
//            neg = true;
//        }
//        int digs = (int)Math.log10(x)+1;
//        int count = 1;
//        int ans = 0;
//        int temp = digs;
//        while(digs>= count){
//            ans += (x % 10) * Math.pow(10,temp-1);
////            System.out.println(ans);
//            x /= 10;
//            temp--;
//            count++;
//        }
//        if(neg){
//            ans *= -1;
//        }
//        System.out.println(ans);
        int n = 1234;
        System.out.println(rev(n,(int)Math.log10(n) + 1));
    }
    static int rev(int n,int digs){
        if(n == 0){
            return 0;
        }
        return n%10 * (int)Math.pow(10,digs-1) + rev(n/10,digs-1);
    }
}
