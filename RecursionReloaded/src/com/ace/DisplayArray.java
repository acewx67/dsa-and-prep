package com.ace;

public class DisplayArray {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        display(arr,0);
    }
    static void display(int [] arr , int index){
        if(index >= arr.length){
            return;
        }
        System.out.println(arr[index]);
        display(arr,++index);
    }
}
