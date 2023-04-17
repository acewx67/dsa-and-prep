package com.ace;
import java.util.*;
public class MergeSortAlgo {
    public static void main(String[] args) {
        int [] arr = {34,2,67,89,12,10};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(merge(new int[]{1,2,3},new int[]{2,3,5,7})));

    }

    static int [] sort(int[] arr){
        if(arr.length==1) return arr;
        int m = arr.length/2;
        int [] left = sort(Arrays.copyOfRange(arr,0,m));
        int [] right = sort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);
    }
    static int [] merge(int [] a,int[] b){
        int [] merged = new int [a.length+b.length];
        int i = 0;
        int j = 0;
        int x = 0;
        while( i < a.length && j < b.length) {
            if(a[i] <= b[j]){
                merged[x] = a[i];
                i++;
                x++;
            }
            else{
                merged[x] = b[j];
                j++;
                x++;
            }
        }
        if(i >= a.length){
            for (int k = j; k < b.length; k++) {
                merged[x] = b[k];
                x++;
            }
        } else {
            for (int k = i; k < a.length; k++) {
                merged[x] = a[k];
                x++;
            }
        }
        return merged;
    }
}
