package com.ace;

public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {
        int [] arr = {1,2};  //ans = 25
        int sum = 0;
        int size = 1;
        while(size-1 < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                sum += sum(arr, i, size);
            }
            size += 2;
        }
        System.out.println(sum);
    }
    static int sum(int [] arr,int p,int size){
        if(p-1 + size >= arr.length) return 0;
        int sum = 0;
        for(int i = 0;i < size;i++){
            sum += arr[p];
            p++;
        }
        return sum;
    }
}
