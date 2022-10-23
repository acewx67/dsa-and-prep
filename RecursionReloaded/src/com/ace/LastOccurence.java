package com.ace;

public class LastOccurence {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,20,80};
        System.out.println(last(arr, arr.length-1,10 ));
    }
    static int last(int [] arr,int index,int target){
        if(index < 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return last(arr,index-1,target);
        }

    }
}
