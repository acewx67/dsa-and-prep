package com.ace;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
	// write your code here
        int []arr = {90,89,78,67,56,45,34,33,32,21,1,0};
        System.out.println(Arrays.toString(Sort(arr)));
    }

    static int [] Sort(int[] arr) {
        boolean swapped = false;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {   //iterate for 'n' times passes
            for (int j = 1; j < length  ; j++) { //or can use j < arr.length-i also,instead of length and length-- statements
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }

            }
            length--;
            if(!swapped){ //can also write if(swapped == false)
                break;
            }
        }
        return arr;
    }
}
