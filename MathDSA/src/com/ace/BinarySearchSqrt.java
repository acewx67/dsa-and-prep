package com.ace;
//works only for Perfect Squares!!!
public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 36;
        int ans = BSsqrt(n);
        System.out.println(ans);
    }
    static int BSsqrt(int n){
        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mid * mid == n){
                return mid;
            }
            if(mid * mid > n){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
