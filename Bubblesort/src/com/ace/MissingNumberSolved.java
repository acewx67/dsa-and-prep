package com.ace;

import java.util.Arrays;

public class MissingNumberSolved {
    public static void main(String[] args) {
        int [] arr = {2,4,1,0,5};
        int ans = Cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int Cyclic(int[] arr){
        int i= 0;
        while(i< arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]) {

                while (arr[i] != i && arr[i] < arr.length) {
                    int correctIndexOfarr_i = arr[i];
                    int temp = arr[i];
                    arr[i] = arr[correctIndexOfarr_i];
                    arr[correctIndexOfarr_i] = temp;
                }
                i++;
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}
