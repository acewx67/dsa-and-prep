package com.ace;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        int zero_ab = 0;
        int two_ab = arr.length-1;
        if(arr[0] == 0) zero_ab = 1;
        if(arr[arr.length-1] == 2) two_ab = arr.length-1-1;
        if(arr.length>1) {
            for (int i = 0; i < arr.length; i++) {
                if (i > two_ab) break;
                if (arr[i] == 0) {

                    swap(arr, zero_ab, i);
                    zero_ab++;
                    if (arr[i] == 2) {
                        swap(arr, two_ab, i);
                        two_ab--;
                    }

                } else if (arr[i] == 2) {
                    swap(arr, two_ab, i);
                    two_ab--;
                    if (arr[i] == 0) {
                        swap(arr, zero_ab, i);
                        zero_ab++;
                    }
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
    static void swap (int [] arr,int i1,int i2){
        int t = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = t;
    }
}
