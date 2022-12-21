package com.ace;

import java.util.Arrays;
            /////////////////////    TIME COMPLEXITY : O(nlogn)     //////////////////////////////////////
public class MergeSorting {
    public static void main(String[] args) {
        int [] arr = {8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int [] mergesort(int [] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int [] merge(int [] arr1, int [] arr2){
        int [] ans = new int [arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j < arr2.length){
            while(j < arr2.length){
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        else if(i < arr1.length){
            while(i < arr1.length){
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        return ans;
    }
}
