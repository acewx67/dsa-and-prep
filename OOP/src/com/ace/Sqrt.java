package com.ace;

public class Sqrt {
    public static void main(String[] args) {
        int n = 99;
        int s = 0;
        int e = n;
        int ans = sqrt(s,e,n);
        System.out.println(ans);


    }
    static int sqrt(int s,int e,int n){
        while(s<e){
            int mid = (s+e)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                e = mid;
            }
            else s = mid+1;
        }
        return s-1;
    }
}
