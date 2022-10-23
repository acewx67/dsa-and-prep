package com.ace;

public class MaxOfArray {
    public static void main(String[] args) {
        int [] arr = {100,20,3,40,5};
        int maximum = max(arr,0,arr[0]);
        System.out.println(maximum);
    }
    static int max(int []arr , int index,int m){
        if(index >= arr.length){
            return m;
        }
        if(arr[index] > m){
            m = arr[index];
        }
        return max(arr,index+1,m);
    }
}
