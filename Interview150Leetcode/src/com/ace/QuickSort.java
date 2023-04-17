package com.ace;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {1,1,6,8,89,3,4,3,8};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int [] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    static void quickSort(int[] arr, int s, int e) {
        //base case
        if(s>=e) return;

        //partition logic
        int p = partition(arr,s,e);
        //recursive calls
        //LHS(pivot)
        quickSort(arr,s,p-1);
        //RHS(pivot)
        quickSort(arr,p+1,e);

    }
    static int partition(int [] arr,int s,int e){
        int pivotElement = arr[s];
        int rightIndex;
        int count = 0;
        for (int i = s+1; i <= e ; i++) {
            if(arr[i] < pivotElement){
                count++;
            }
        }
        rightIndex = s + count;
        //swap pivot Element with element on right index
        swap(arr,s,rightIndex);
        pivotElement = arr[rightIndex];

        //swap the elements that are on wrong side of pivot(eg. larger than pivot on LHS(pivot) )
        int i = s;
        int j = e;
        while(i < rightIndex && j > rightIndex){
            while(arr[i] <= pivotElement){
                i++;
            }
            while(arr[j] > pivotElement){
                j--;
            }
            if(i < rightIndex && j > rightIndex){
                swap(arr,i,j);
            }
        }
        return rightIndex;
    }
}
