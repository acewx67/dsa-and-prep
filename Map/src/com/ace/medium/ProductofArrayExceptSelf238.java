package com.ace.medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] l = new int [arr.length];
        int [] r = new int [arr.length];
        int prod_l = 1;
        int prod_r = 1;
        for (int i = 0; i < arr.length; i++) {
            prod_l *= i-1 < 0 ? 1 : arr[i-1];
            l[i] = prod_l;
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            prod_r *= i+1 >= arr.length ? 1 : arr[i+1];
            r[i] = prod_r;
        }
        int i = 0;
        while(i < arr.length){
            arr[i] = l[i] * r[i];
            i++;
        }
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(arr));
    }
}
