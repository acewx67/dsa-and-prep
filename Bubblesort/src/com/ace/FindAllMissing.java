package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllMissing {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        Cyclic(arr);
        System.out.println(Cyclic(arr));
        System.out.println(Arrays.toString(arr));

    }
    static ArrayList<Integer> Cyclic(int[] arr){
        int i =0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){

                int first = i;
                int second = correct;
                swap(arr,first,second);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1 ){
                list.add(index+1);
            }
        }
        return list;
    }
    static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

