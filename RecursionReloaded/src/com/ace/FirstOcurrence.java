package com.ace;

public class FirstOcurrence {
    public static void main(String[] args) {
        int [] arr = {2,3,9,7,7,6,4,12,7,3,8};
        System.out.println(first(arr,8,0));

    }
    static int first(int [] arr,int target, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else return first(arr,target,index+1);
    }
}
