package com.ace;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,1,3};
        int ans = goodpairs(arr);
        System.out.println(ans);
    }

    static int goodpairs(int[] arr) {
        int pairs = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
