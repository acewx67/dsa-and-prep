package com.ace;

import java.util.Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {

            int [] arr1 ={1,2,3,0,0,0};
            int m = arr1.length;
            int [] arr2 = {2,5,6};
            int n = arr2.length;
            // Write your code here.
            for(int i =0;i<n;i++){  //copying arr2 elements into arr1
                arr1[m-i-1] = arr2[i];
            }
        System.out.println(Arrays.toString(arr1));
            int [] ans = bubblesort(arr1);
        System.out.println(Arrays.toString(ans));
    }

        static int[] bubblesort(int[] arr1){
            int m = arr1.length;
            for(int i =0;i<m;i++){
                for(int j=1;j<m-i;j++){
                    int temp=0;
                    if(arr1[j-1] > arr1[j]){
                        temp= arr1[j-1];
                        arr1[j-1] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            return arr1;
        }
    }

