package com.ace;

public class FirstPositiveMissing {
    public static void main(String[] args) {
        int [] arr = {2,4,3,0};
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i-1],arr[i]);
        }
        System.out.println(min);
        System.out.println(Cyclic(arr));
    }
    static int Cyclic(int[] arr){
        int i= 0;
//        while(i< arr.length) {
//            if(arr[i] < arr.length && arr[i] != arr[arr[i]]) {
//
//                while (arr[i] != i && arr[i] < arr.length) {
//                    int correctIndexOfarr_i = arr[i];
//                    int temp = arr[i];
//                    arr[i] = arr[correctIndexOfarr_i];
//                    arr[correctIndexOfarr_i] = temp;
//                }
//                i++;
//            }
//            else{
//                i++;
//            }
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){  //ignore zero and negatives and ignore > arr.length
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return index+1; //returns the first found missing number (or) smallest positive number
            }
        }
        return arr.length+1;
    }
    static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
