package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleMissingAttempt {
    public static void main(String[] args) {
        int [] arr = {1,0,4,3,2};
        ArrayList<Integer> ans = Cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static ArrayList<Integer> Cyclic(int[] arr){
        int i= 0;
        while(i< arr.length) {
            if(arr[i] < arr.length && arr[i] != i+1) {

                while (arr[i] != i+1 && arr[i] < arr.length) {
                    int correctIndexOfarr_i = arr[arr[i] - 1];
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
        ArrayList<Integer> list = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != arr[arr[index]-1]){
                list.add(index+1);
            }
        }
        list.add(arr.length);
        return list;
    }
}
