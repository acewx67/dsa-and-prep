package com.ace;

public class FindIfArrayIs_Sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int [] arr){
        return helper(arr,0);
    }
    private static boolean helper(int [] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        else{
            return helper(arr,index+1);
        }
    }
}
