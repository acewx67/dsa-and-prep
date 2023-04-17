package com.ace;
import java.util.*;
public class MergeSortAlgoInPlace {
    public static void main(String[] args) {
        int [] arr = {5,2,8,1,9,3,7,0};
//        System.out.println(Arrays.toString(sort(arr)));

        mergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static int [] sort(int [] arr){
        if(arr.length == 1) return arr;
        int m = arr.length/2;
        int [] left = sort(Arrays.copyOfRange(arr,0,m));
        int [] right = sort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);
    }
    static int [] merge(int [] a,int [] b){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mergedArray = new int [a.length+b.length];
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                mergedArray[k] = a[i];
                i++;
            }
            else{
                mergedArray[k] = b[j];
                j++;
            }
            k++;
        }
        if(i >= a.length){
            for (int l = j; l < b.length; l++) {
                mergedArray[k] = b[l];
                k++;
            }
        } else {
            for (int l = i; l < a.length; l++) {
                mergedArray[k] = a[l];
                k++;
            }
        }
        return mergedArray;
    }
    static void sort1(int [] arr,int s,int e){
        if(s==e) return;
        int m = (s+e)/2;



    }
    static void merge1(int [] arr,int s,int m,int e){
        int s2 = m + 1;
        if (arr[m] <= arr[s2]) {
            return;
        }
        while(s <= m && s2 <= e){
            if(arr[s] <= arr[s2]){
                //dont swap
                s++;
            }
            else{
                int value = arr[s2];
                int index = s2;

                while(index != s){
                    arr[index] = arr[index-1];
                    index--;
                }
                arr[s] = value;

                s++;
                m++;
                s2++;

            }
        }
    }

    static void mergeSort(int [] arr,int l,int r) {
        if (l < r) {
            // Same as (l + r) / 2, but avoids overflow
            // for large l and r
            int m = (l+r)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge1(arr, l, m, r);
        }
    }
}
