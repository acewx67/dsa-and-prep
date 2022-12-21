package com.ace;

import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(
                next(n)
        );
    }
    static int next(int n){
        int [] arr = new int [(int)Math.log10(n) + 1];
        int t = n;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arr[i] = t%10;
            t /= 10;
        }
        System.out.println(Arrays.toString(arr));

        int i,j;
        for (i = arr.length-1;i>0 ; i--){
            if(arr[i-1] < arr[arr.length-1]){
//                int temp = arr[i];
//                arr[i] = arr[i-1];
//                arr[i-1] = temp;
                break;
            }
        }
        if(i == 0){
            return -1;
        }
        // II) Find the smallest digit on right side of (i-1)'th
        // digit that is greater than number[i-1]
//        int x = arr[i-1], smallest = i;
//        for (j = i+1; j < arr.length; j++) {
//            if (arr[j] > x && arr[j] <= arr[smallest]) {
//                smallest = j;
//            }
//        }
//        //swap the above found smallest digit with arr[i-1]
//        {
//            int temp = arr[smallest];
//            arr[smallest] = arr[i-1];
//            arr[i-1] = temp;
//        }
//        // IV) Sort the digits after (i-1) in ascending order
//        Arrays.sort(arr, i, arr.length);
        // II) Find the smallest digit on right side of (i-1)'th
        // digit that is greater than number[i-1]
        int x = arr[i-1], smallest = i;
        for (j = i+1; j < arr.length; j++)
            if (arr[j] > x && arr[j] <= arr[smallest])
                smallest = j;

        // III) Swap the above found smallest digit with
        // number[i-1]
        int temp = arr[i-1];
        arr[i-1] = arr[smallest];
        arr[smallest] = temp;
        int digits = (int)Math.log10(n)+1;
        int sum = 0;
        for (int temp1 = 0; temp1 < arr.length; temp1++) {
            sum += arr[i]*Math.pow(10,digits-1);
            digits--;
        }
        return ((sum > n && sum != 0)?sum : -1);
    }
}






























//        int t = (int)Math.log10(n);
//        int digits = t + 1;
//        int [] arr = new int [digits];
//        int t1 = n;
//        for(int i = arr.length-1; i >=0;i--){
//            arr[i] = t1%10;
//            t1 /=  10;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            if(arr[i] > arr[i-1]){
//                int t2 = arr[i];
//                arr[i] = arr[i-1];
//                arr[i-1] = t2;
//                break;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i]*Math.pow(10,digits-1);
//            digits--;
//        }
//        System.out.println(sum);