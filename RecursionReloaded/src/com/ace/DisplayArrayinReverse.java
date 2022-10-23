package com.ace;

public class DisplayArrayinReverse {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
//        displayrev(arr,0);
        disrev(arr, arr.length-1);
    }
    static void displayrev(int [] arr,int index){
        if(index >= arr.length){
            return;
        }
        displayrev(arr,index+1);
        System.out.println(arr[index]);
    }
    static void disrev(int [] arr,int index){
        if(index < 0){
            return;
        }
        System.out.println(arr[index]);
        disrev(arr,index-1);

    }

}
